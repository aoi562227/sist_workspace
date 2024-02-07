package day0125;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UseImageIcon extends JFrame{
	
	public UseImageIcon() {
		super("이미지 연습");
		ImageIcon imageIcon = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img1.png");
		ImageIcon imageIcon2 = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img4.png");
		ImageIcon imageIcon3 = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img2.png");
		ImageIcon imageIcon4 = new ImageIcon("E:/dev/workspace/java_se/src/day0125/images/img3.png");
		
		
		JLabel jLabel = new JLabel(imageIcon);
		JButton jButton = new JButton("지리는이미지", imageIcon2);
		JButton jButton2 = new JButton("버튼");
		JButton jButton3 = new JButton("차차", imageIcon3);
		
//		jButton.setSize(100, 100);
//		jButton.setLocation(193, 170);
		
		setLayout(null);
		
		jLabel.setBounds(100,100,300,200);
		jButton.setBounds(420,100,400,200);
		jButton2.setBounds(200, 200, 80, 30);
		jButton3.setBounds(840,100,320,200);
		
		jButton.setToolTipText("지림");
		jButton3.setToolTipText("손흔드는 차차");
		
		jButton.setVerticalTextPosition(JButton.BOTTOM);
		jButton3.setVerticalTextPosition(JButton.TOP);
		jButton3.setHorizontalTextPosition(JButton.CENTER);
		
		jButton3.setRolloverIcon(imageIcon4);
		
		add(jButton2);
		add(jButton);
		add(jLabel);
		add(jButton3);
		
		
		setBounds(100, 100, 1200, 400);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main(String[] args) {
		new UseImageIcon();
	}//main
}
