package dat0126;

import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class UseJList extends JFrame {
    public UseJList() {
        super("MVC패턴이 도입된 클래스");

        // Model 객체 생성
        DefaultListModel<String> dlm = new DefaultListModel<>();

        // Model과 has a 관계의 View 생성
        JList<String> jl = new JList<>(dlm);

        // Model 객체를 통해서 값 할당
        dlm.addElement("Java");
        dlm.addElement("Oracle");
        dlm.addElement("JDBC");
        dlm.addElement("CSS");

        JScrollPane jsp = new JScrollPane(jl);

        jl.setBorder(new TitledBorder("과목명"));

        setLayout(new GridLayout(1, 1)); // Move this line before add(jsp);

        add(jsp);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new UseJList();
    }
}
