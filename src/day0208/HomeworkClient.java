package day0208;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

public class HomeworkClient {
    public void msgClient() throws IOException {
        DataOutputStream dataOutputStream = null;
        Socket client = null;

        try {
            String ip = JOptionPane.showInputDialog("서버의 ip를 입력해주세요\n사용가능 ip) 210 - 232");
            client = new Socket("192.168.10." + ip, 7770);
            
            dataOutputStream = new DataOutputStream(client.getOutputStream());
            
            String msg = JOptionPane.showInputDialog("보낼 메시지를 입력");
            dataOutputStream.writeUTF(msg);
        } finally {
            // Close resources in reverse order of their creation
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            if (client != null) {
                client.close();
            }
        }
    }
    
    public static void main(String[] args) {
		HomeworkClient homeworkClient = new HomeworkClient();
		try {
			homeworkClient.msgClient();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
