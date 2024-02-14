package kr.co.sist.chat.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class MultiChatServer extends JFrame implements ActionListener, Runnable{
	private JButton jbtnStartServer, jbtnclose;
	private DefaultListModel<String> dlmConnect;
	private JScrollPane jspConnectList;
	
	private Thread threadServer;
	
	private ServerSocket server;
	
	public static List<ChatHelper> listConnect;
	
	public MultiChatServer() {
		super("채팅서버");
		
		listConnect = new ArrayList<ChatHelper>();
		
		
		jbtnStartServer=new JButton("서버가동");
		jbtnclose=new JButton("서버종료");
		dlmConnect=new DefaultListModel<String>();
		JList<String> jlConnect=new JList<String>( dlmConnect );
		jspConnectList=new JScrollPane(jlConnect);
		
		jspConnectList.setBorder(new TitledBorder("접속자 리스트"));
		JPanel jpSouth=new JPanel();
		jpSouth.add(jbtnStartServer);
		jpSouth.add(jbtnclose);
		
		add("Center", jspConnectList);	
		add("South", jpSouth);
		
		jbtnStartServer.addActionListener(this);
		jbtnclose.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(JFrame.ABORT);
				try {
					closeWin();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
		});
		
		setBounds(100, 100, 400, 700);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtnStartServer) {
			if (threadServer != null) {
				JOptionPane.showMessageDialog(this, "서버가 가동 중 입니다");
				return;
			}
			threadServer = new Thread(this);
			threadServer.start();
		}
		if (e.getSource() == jbtnclose) {
			
		}
	}
	
	public void closeWin() throws IOException {
		try {
			if (server != null) {
				server.close();
			}
		} finally {
			dispose();
		}
		
		
	}

	@Override
	public void run() {
		try {
			server = new ServerSocket(2024);
			dlmConnect.addElement("서버가 정상적으로 실행되었습니다");
			Socket tempClient = null;
			ChatHelper tempCh = null;
			
			for (int cnt = 1;; cnt++) {
				tempClient = server.accept();
				tempCh = new ChatHelper(tempClient, cnt, dlmConnect);
				listConnect.add(tempCh);
				tempCh.start();
				
				jspConnectList.getVerticalScrollBar().setValue(jspConnectList.getVerticalScrollBar().getMaximum());
				tempCh.broadcast(cnt + "번째로 접속자가 접속하였습니다");
			}		
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "서버 가동 중 문제가 발생하였습니다");
			e.printStackTrace();
		}
	}
	
	
	
}
