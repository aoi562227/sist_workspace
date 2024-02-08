package day0208;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class SimpleClient {

	public void msgClient() throws IOException {
		DataInputStream dataInputStream = null;
		Socket client = null;

		try {
			String ip = JOptionPane.showInputDialog("서버의 ip를 입력해주세요\n사용가능 ip) 210 - 232");
			client = new Socket("192.168.10."+ip, 7770);
			dataInputStream = new DataInputStream(client.getInputStream());
			
			String msg = dataInputStream.readUTF();
			JOptionPane.showMessageDialog(null, "친구의 메시지 : " + msg);
		} finally {
			// TODO: handle finally clause
			if (dataInputStream != null) {
				dataInputStream.close();
			}
			if (client != null) {
				client.close();
			}
		}
	}

	public static void main(String[] args) {
		SimpleClient simpleClient = new SimpleClient();
		try {
			simpleClient.msgClient();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// main
}
