package day0124;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UseFlowLayout extends JFrame {
	
	public UseFlowLayout() {
		super("FlowLayout Practice");
		JLabel jLabelName = new JLabel("이름");
		JTextField jTextFieldName = new JTextField(10);
		JCheckBox jCheckBoxSave = new JCheckBox("저장");
		JButton jButtonInput = new JButton("입력");
		
		setLayout(new FlowLayout());
		
		add(jLabelName);
		add(jTextFieldName);
		add(jCheckBoxSave);
		add(jButtonInput);
		
		setSize(500, 400);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new UseFlowLayout();
		JOptionPane.showInputDialog("학생의 정보를 아래와 같이 입력해주세요.\n예) 학생번호,이름,자바점수,오라클점수");
	}//main
}
