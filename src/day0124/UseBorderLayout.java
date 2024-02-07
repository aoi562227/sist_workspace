package day0124;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UseBorderLayout extends JFrame {

	public UseBorderLayout() {
		super("경계 레이아웃");
		JButton jButtonNorth = new JButton("북쪽");
		JButton jButtonWest = new JButton("서쪽");
		JLabel jLabelEast = new JLabel("동쪽");
		JLabel jLabelSouth = new JLabel("남쪽");
		
		JTextArea jTextAreaCenter = new JTextArea("가운데");
//		setLayout(new BorderLayout());
		
		add("North", jButtonNorth);
		add(BorderLayout.WEST, jButtonWest);
		add("Center", jTextAreaCenter);
		add(jLabelEast, "East");
		add(jLabelSouth, BorderLayout.SOUTH);
		
		setSize(500, 500);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}//main
}
