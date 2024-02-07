package dat0126;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class UseBorder extends JFrame {

	public UseBorder() {
		// TODO Auto-generated constructor stub
		super("Border 연습");
		
		JButton jButton = new JButton("왼쪽");
		JButton jButton2 = new JButton("오른쪽");
		JButton jButton3 = new JButton("오른쪽2");
		
		JPanel jPanelLeft = new JPanel();
		JPanel jPanelRight = new JPanel();
		
		jPanelLeft.setBorder(new LineBorder(Color.CYAN));
		jPanelRight.setBorder(new TitledBorder("버튼을 클릭해보세요"));
		
		jPanelLeft.add(jButton);
		jPanelRight.add(jButton2);
		jPanelRight.add(jButton3);
		
		setLayout(new GridLayout(1,2));
		
		add(jPanelLeft);
		add(jPanelRight);
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UseBorder();
	}//main
}
