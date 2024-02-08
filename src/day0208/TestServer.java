package day0208;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;
public class TestServer {
	
	public TestServer() throws IOException {
		// TODO Auto-generated constructor stub
		ServerSocket server = new ServerSocket(36000);
//		ServerSocket server2 = new ServerSocket(35001);
		
//		Socket client2 = server.accept();
		
		while (true) {
            Socket client = server.accept();
            System.out.println("접속자 있음: " + client.getInetAddress());
        }
		
		
		
//		System.out.println("접속자 있음2" + client2.getInetAddress());
//		Logger.getLogger("접속자 있음");
		
		
	}
	
	
	public static void main(String[] args) {
		try {
			new TestServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
