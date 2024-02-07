package dat0126;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class UseJTable extends JFrame {

	public UseJTable() {
		// TODO Auto-generated constructor stub
		super("MVC패턴을 도입한 JTable");
		
		//Model 객체생성
		String[] columName = {"번호", "이름", "나이", "이메일"};
		String[][] data = {
				{"1", "가", "24", "test@test.com"},
				{"2", "나", "50", "hihi@test.com"},
				{"3", "다", "13", ""},
				{"4", "라", "24", "cook@test.com"},
		};
		DefaultTableModel dtm = new DefaultTableModel(data, columName);
		//Model객체와 has a 관계로 View 생성
		JTable jtable = new JTable(dtm);
		//데이터 추가 -> Model 객체를 사용
		String[] tempData = {"5", "마", "40", ""};
		dtm.addRow(tempData);
		
		Vector<String> vec = new Vector<String>();
		vec.add("6");
		vec.add("바");
		vec.add("60");
		vec.add("ba@test.com");
		dtm.addRow(vec);
		
		
		JScrollPane jsp = new JScrollPane(jtable);
		jsp.setBorder(new TitledBorder("훈민정음"));
		add(jsp);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new UseJTable();
	}//main
}