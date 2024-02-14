package day0213;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener, Runnable {
    private JTextArea jtaTalkDisplay;
    private JTextField jtfTalk;
    private JScrollPane jspTalk;

    private ServerSocket server;

    public SimpleChatServer() {
        super(":::::::채팅서버:::::::");
        jtaTalkDisplay = new JTextArea();
        jtaTalkDisplay.setEditable(false);
        jtfTalk = new JTextField();
        jspTalk = new JScrollPane(jtaTalkDisplay);

        jspTalk.setBorder(new TitledBorder("대화내용"));
        jtfTalk.setBorder(new TitledBorder("대화"));

        add("Center", jspTalk);
        add("South", jtfTalk);

        jtfTalk.addActionListener(this);

        setBounds(100, 100, 500, 600);
        setVisible(true);

        try {
        	server = new ServerSocket(2024);

            while (true) {
                Socket clientSocket = server.accept();
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    closeServer();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    dispose();
                }
            }
        });
    }

    private void closeServer() throws IOException {
        if (server != null) {
            server.close();
        }
    }


    private void handleClient(Socket clientSocket) {
        new Thread(() -> {
            try (
                DataInputStream dis = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream dos = new DataOutputStream(clientSocket.getOutputStream())
            ) {
                while (true) {
                    String msg = dis.readUTF();
                    if (msg.equals("exit")) {
                        break;
                    }
                    jtaTalkDisplay.append(msg + "\n");
                    jtaTalkDisplay.setCaretPosition(jtaTalkDisplay.getDocument().getLength());
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "클라이언트와의 통신 중 오류가 발생했습니다");
                e.printStackTrace();
            }
        }).start();
    }

    private void sendMsg() {
        String msg = jtfTalk.getText();
        if (!msg.isEmpty()) {
            jtaTalkDisplay.append("server : " + msg + "\n");
            jtaTalkDisplay.setCaretPosition(jtaTalkDisplay.getDocument().getLength());
            jtfTalk.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sendMsg();
    }

    public static void main(String[] args) {
        new SimpleChatServer();
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
