package day0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatClient extends JFrame implements ActionListener, Runnable {
	private JTextArea jtaTalkDisplay;
	private JTextField jtfTalk;
	private JScrollPane jspTalk;
	
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	
	public SimpleChatClient() {
		super(":::::::채팅클라이언트:::::::");
		jtaTalkDisplay=new JTextArea();
		jtaTalkDisplay.setEditable(false);
		jtfTalk=new JTextField();
		jspTalk=new JScrollPane( jtaTalkDisplay);
		
		jspTalk.setBorder(new TitledBorder("대화내용"));
		jtfTalk.setBorder(new TitledBorder("대화"));
		
		add("Center", jspTalk);
		add("South", jtfTalk);
		jtfTalk.addActionListener(this);
		

		
		setBounds(100, 100, 500, 600);
		setVisible(true);
		try {
			connectToServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					closeClient();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally {
					dispose();
				}
			}
			
		});
	}//SimpleChatServer
	
	private void closeClient() throws IOException {
		if (dosWriteStream != null) {
			dosWriteStream.close();
		}
		if (disReadStream != null) {
			disReadStream.close();
		}
		if (someClient != null) {
			someClient.close();
		}
		
	}
	
	private void connectToServer() throws UnknownHostException, IOException {
		//2.서버 소켓을 생성 :: 서버로 연결 시도
		someClient = new Socket("192.168.10.210",2024);
//		someClient = new Socket("127.0.0.1",2024);
//		4. 데이터를 주고 받을 수 있도록 스트림을 연결
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		Thread clientThread = new Thread(this);
		clientThread.start();
		jtaTalkDisplay.setText("서버에 연결되었습니다\n");
	}
	
	
	/**
	 * 접속자가 보내오는 메시지를 계속 읽어 들인다
	 * @throws IOException 
	 */
	@Override
	public void run(){
		if (disReadStream != null) {
			String msg = "";
			try {
				while (true) {
					//메시지를 Thread로 동시에 읽어들여 JTA에 출력
					msg = disReadStream.readUTF();
					jtaTalkDisplay.append(msg + "\n");
					jtaTalkDisplay.setCaretPosition(jtaTalkDisplay.getDocument().getLength());
				}
			} catch (IOException e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			
		}
	}
	
	private void sendMsg() throws IOException {
		if (dosWriteStream == null) {
			JOptionPane.showMessageDialog(this, "서버에 연결 전입니다");
			return;
		}
		
		String msg = jtfTalk.getText();
		
		if (!msg.isEmpty()) {
			//메시지를 스트림에 쓰기
			dosWriteStream.writeUTF("헤아냥 : " + msg);
			dosWriteStream.flush();
			jtaTalkDisplay.append("나 : " + msg+"\n");
			//JTF초기화
			jtfTalk.setText("");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		try {
			sendMsg();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}//actionPerformed
	
	

	public static void main(String[] args) {
//		SimpleChatClient simpleChatClient = new SimpleChatClient();
//		try {
//			simpleChatClient.connectToServer();
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		new SimpleChatClient();
	}//main

	

}//class
