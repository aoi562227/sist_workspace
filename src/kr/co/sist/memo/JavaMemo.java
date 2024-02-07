package kr.co.sist.memo;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JavaMemo extends JFrame{
	public JavaMemo() {
		// TODO Auto-generated constructor stub
		super("메모장");
		JMenuBar jMenuBar = new JMenuBar();

        JMenu jFileMenu = new JMenu("파일");
        JMenu jHelpMenu = new JMenu("도움말");
//		1번 메뉴
        JMenuItem newItem = new JMenuItem("새글");
        JMenuItem openItem = new JMenuItem("열기");
        JMenuItem saveItem = new JMenuItem("저장");
        JMenuItem exitItem = new JMenuItem("종료");

//		2번 메뉴
        JMenuItem aboutMemoItem = new JMenuItem("메모장 정보");


        jFileMenu.add(newItem);
        jFileMenu.add(openItem);
        jFileMenu.add(saveItem);
        jFileMenu.add(exitItem);

        jHelpMenu.add(aboutMemoItem);

        jMenuBar.add(jFileMenu);
        jMenuBar.add(jHelpMenu);

        setJMenuBar(jMenuBar);
        
        //TextArea
        JTextArea jTextArea = new JTextArea();
		jTextArea.setLineWrap(true);
//		JList<String> jList = new JList<String>();
		setLayout(new GridLayout(1,1));
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea);

		
		
		
		add(jScrollPane);

        setSize(500, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JavaMemo();
	}//main
}
