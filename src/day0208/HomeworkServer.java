package day0208;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class HomeworkServer {
	public void msgServer() throws IOException {
		// TODO Auto-generated constructor stub
		ServerSocket server = null;
		Socket client = null;
		DataInputStream dataInputStream = null;
		
		try {
			server = new ServerSocket(7770);		
			while (true) {
				client = server.accept();
				
				dataInputStream = new DataInputStream(client.getInputStream());
				String msg = dataInputStream.readUTF();
				JOptionPane.showMessageDialog(null, "친구의 메시지 : " + msg);
			}
		} finally {
			// TODO: handle finally clause
			if (dataInputStream!=null) {
				dataInputStream.close();
			}
			if (client!=null) {
				client.close();
			}
			if (server!=null) {
				server.close();
			}
		}
	}

	public static void main(String[] args) {
		HomeworkServer homeworkServer = new HomeworkServer();
		try {
			homeworkServer.msgServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main

}
