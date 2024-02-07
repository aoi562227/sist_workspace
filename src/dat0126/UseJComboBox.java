package dat0126;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class UseJComboBox extends JFrame {
	public UseJComboBox() {
		// TODO Auto-generated constructor stub
		super("JComboBox사용");
		
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		
		JComboBox<String> jcb = new JComboBox<String>(dcbm);
		
		dcbm.addElement("가");
		dcbm.addElement("나");
		dcbm.addElement("다");
		dcbm.addElement("라");
		
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("MVC 패턴을 도입할 클래스들"));
		jp.add(jcb);
		
		add("North", jp);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new UseJComboBox();
	}// main
}
