package day0208;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {
	
	public TestClient() throws UnknownHostException, IOException {
		// TODO Auto-generated constructor stub
		Socket client = new Socket("192.168.10.226", 35000);
		
		
//		client.connect("192.168.10.227");
	}
	
	public static void main(String[] args) {
		try {
			new TestClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
