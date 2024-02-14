package kr.co.sist.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiChatClient extends JFrame implements ActionListener, Runnable {

	private JTextField jtfServerIp, jtfNick, jtfTalk;
	private JTextArea jtaTalkDisplay;
	private JScrollPane jspJtaTalk;
	private JButton jbtnConnectServer, jbtnCapture;

	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;

	private Thread threadRead;

	public MultiChatClient() {
		super("채팅 클라이언트");

		jtfServerIp = new JTextField("192.168.10.", 10);
		jtfNick = new JTextField(7);
		jtfTalk = new JTextField();
		jtaTalkDisplay = new JTextArea();
		jtaTalkDisplay.setEditable(false);
		jspJtaTalk = new JScrollPane(jtaTalkDisplay);
		jbtnConnectServer = new JButton("서버접속");
		jbtnCapture = new JButton("대화저장");

		JPanel jpNorth = new JPanel();

		jpNorth.add(new JLabel("서버주소"));
		jpNorth.add(jtfServerIp);
		jpNorth.add(new JLabel("대화명"));
		jpNorth.add(jtfNick);
		jpNorth.add(jbtnConnectServer);
		jpNorth.add(jbtnCapture);

		add("North", jpNorth);
		add("Center", jspJtaTalk);
		add("South", jtfTalk);

		jbtnConnectServer.addActionListener(this);
		jbtnCapture.addActionListener(this);
		jtfTalk.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(JFrame.ABORT);
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeWin();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});

		setBounds(100, 100, 700, 400);
		setVisible(true);

	}
	
	public void closeWin() throws IOException {
		try {
			if (someClient!=null) {
				someClient.close();
			}
		} finally {
			dispose();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while (true) {
				jtaTalkDisplay.append(disReadStream.readUTF() + "\n");
				jspJtaTalk.getVerticalScrollBar().setValue(jspJtaTalk.getVerticalScrollBar().getMaximum());
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "서버와 연결이 끊어졌습니다");
			e.printStackTrace();
		}

	}

	public void sendMsg() throws IOException {
		String nick = jtfNick.getText().trim();
		String talk = jtfTalk.getText();

		dosWriteStream.writeUTF("[" + nick + "] " + talk);
		dosWriteStream.flush();

		jtfTalk.setText("");
	}

	public void capture() throws IOException {
		File saveDir = new File("c:/dev/chat_backup/");
		if (saveDir.exists()) {
			saveDir.mkdir();
		}

		File saveFile = new File(saveDir.getAbsolutePath() + "/capture_" + System.currentTimeMillis() + ".dat");

		FileWriter fw = null;

		try {
			fw = new FileWriter(saveFile);
			fw.write(jtaTalkDisplay.getText());
			fw.flush();
		} finally {
			if (fw != null) {
				fw.close();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtnConnectServer) {// 서버연결
			try {
				connectToServer();
				jtaTalkDisplay.setText("서버에 연결되었습니다\n");
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "서버와 연결이 종료되었습니다");
				e1.printStackTrace();
			}
		}
		if (e.getSource() == jtfTalk) {// 대화입력
			try {
				sendMsg();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == jbtnCapture) {// 대화내용 캡쳐
			try {
				capture();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private void connectToServer() throws UnknownHostException, IOException {
		String ip = jtfServerIp.getText().trim();
		String nick = jtfServerIp.getText().trim();
		if (nick.isEmpty()) {
			JOptionPane.showMessageDialog(this, "대화명은 필수 입력입니다");
			jtfNick.setText("");
			jtfNick.requestFocus();
			return;
		}

		if (someClient != null) {
			JOptionPane.showMessageDialog(this, "서버에 접속 중입니다");
			return;
		}
		someClient = new Socket(ip, 2024);
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		dosWriteStream.writeUTF(nick);
		dosWriteStream.flush();

		threadRead = new Thread(this);
		threadRead.start();
	}

}
