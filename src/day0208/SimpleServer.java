package day0208;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	
	public void msgServer() throws IOException {
		ServerSocket server = null;
		Socket client = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			server = new ServerSocket(7770);
			String msg = "예찬하이~";
			
			while (true) {
				client = server.accept();
				
				dataOutputStream = new DataOutputStream(client.getOutputStream());
				dataOutputStream.writeUTF(msg);
				dataOutputStream.flush();
			}
		} finally {
			// TODO: handle finally clause
			if (dataOutputStream!=null) {
				dataOutputStream.close();
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
		SimpleServer simpleServer = new SimpleServer();
		try {
			simpleServer.msgServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
