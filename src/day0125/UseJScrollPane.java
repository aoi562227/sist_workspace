package day0125;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseJScrollPane extends JFrame {
	
	public UseJScrollPane() {
		super("스크롤 바 연습");
		
		JTextArea jTextArea = new JTextArea("아무말");
		jTextArea.setLineWrap(true);
//		jTextArea.setCursor(cursor.);
		String[] dataArr = "자바,오라클,JDBC,HTML,CSS,JavaScript, JavaScript Library,Servlet/JSP,AJAX,JSON,XML,".split(",");
		JList<String> jList = new JList<String>(dataArr);
		setLayout(new GridLayout(1,2));
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		JScrollPane jScrollPane2 = new JScrollPane(jList);
		
		
		
		add(jScrollPane);
		add(jScrollPane2);
		
		setBounds(100, 100, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new UseJScrollPane();
	}//main
}
