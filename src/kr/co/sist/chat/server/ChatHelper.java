package kr.co.sist.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.DefaultListModel;

/**
 * 서버에서 소켓을 전달받아 
 * 대화를 읽고 쓰기 위한스트림을 연결하고
 * 대화를 무한루프로 읽어들여
 * 모든 접속자에게 출력하는 일
 */
public class ChatHelper extends Thread {
	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private int cnt;
	private DefaultListModel<String> dlmConnect;
	private String connIp, nick;
	

	public ChatHelper(Socket someClient, int cnt, DefaultListModel<String> dlmConnect) throws IOException {
		this.someClient = someClient;
		this.cnt = cnt;
		this.dlmConnect = dlmConnect;
		connIp = someClient.getInetAddress().toString();
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		nick = disReadStream.readUTF();
		
		dlmConnect.addElement(nick + "님이 " + cnt + "번째로 접속하였습니다 [" + someClient.getInetAddress() + "]");
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		String revMsg;
		try {
			while (true) {
				revMsg = disReadStream.readUTF();
				broadcast(revMsg);
			}
		} catch (IOException e) {
			dlmConnect.addElement(cnt + "번째 접속자가 접속을 종료하였습니다 [" + connIp + "]");
			try {
				if (someClient != null) {
					someClient.close();
				}
				MultiChatServer.listConnect.remove(this);
				broadcast(cnt + "번째 접속자가 접속을 종료하였습니다");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				dlmConnect.addElement(nick + "님이 접속을 종료하였습니다 [" + connIp + "]");

			}
		}
		
	}
	/**
	 * @param msg
	 * 모든 접속자에게 메시지를 보내는 메서드
	 * @throws IOException 
	 */
	public void broadcast(String msg) throws IOException {
		for (ChatHelper ch : MultiChatServer.listConnect) {
			ch.dosWriteStream.writeUTF(msg);
			ch.dosWriteStream.flush();
		}
	}
	
	
	
}
