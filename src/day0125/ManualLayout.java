package day0125;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class ManualLayout {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("Manual Layout Example");
        frame.setLayout(null);

        // 버튼 생성
        JButton jbtn = new JButton("버튼");
        jbtn.setSize(100, 30);
        jbtn.setLocation(50, 50);

        // 레이블 생성
        JLabel jl = new JLabel("레이블");
        jl.setSize(100, 30);
        jl.setLocation(50, 100);
        jl.setForeground(Color.CYAN);

        // 패스워드 필드 생성
        JPasswordField jpf = new JPasswordField();
        jpf.setSize(100, 30);
        jpf.setLocation(50, 150);

        // 텍스트 에어리어와 스크롤 패널 생성
        JTextArea jta = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jta);
        jScrollPane.setSize(200, 100);
        jScrollPane.setLocation(200, 50);

        // 드롭다운을 위한 콤보박스 생성
        JComboBox<String> genderComboBox = new JComboBox<>();
        genderComboBox.addItem("남자");
        genderComboBox.addItem("여자");
        genderComboBox.setSize(100, 30);
        genderComboBox.setLocation(50, 200);

        // 폰트 설정
        Font font = new Font("궁서체", Font.BOLD, 20);
        jl.setFont(font);
        jbtn.setFont(font);
        jpf.setFont(font);
        genderComboBox.setFont(font);

        // 텍스트 에어리어 폰트 및 색상 설정
        jta.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 20));
        jta.setForeground(new Color(0x123456));
        jta.setBackground(Color.GRAY);
        
        jta.setText("텍스트를 추가합니다.");

        // 배치
        frame.add(jbtn);
        frame.add(jl);
        frame.add(jpf);
        frame.add(jScrollPane);
        frame.add(genderComboBox);
        frame.add(jta);

        // 프레임 설정
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
