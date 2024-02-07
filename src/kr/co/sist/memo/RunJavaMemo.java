package kr.co.sist.memo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunJavaMemo extends JFrame {
    public RunJavaMemo() {
        DefaultListModel<String> dlm = new DefaultListModel<>();
        DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<>();

        JTextField nameTextField = new JTextField();
        JTextField teleTextField = new JTextField();
        JList<String> jList = new JList<>(dlm);

        // JComboBox에 나이 추가
        for (int i = 20; i <= 40; i++) {
            dcbm.addElement(Integer.toString(i));
        }

        JComboBox<String> ageComboBox = new JComboBox<>(dcbm);

        JRadioButton manRadioButton = new JRadioButton("남자");
        JRadioButton womenRadioButton = new JRadioButton("여자");
        JButton addButton = new JButton("추가");
        JButton editButton = new JButton("변경");
        JButton delButton = new JButton("삭제");
        JButton exitButton = new JButton("종료");

        // 두 라디오 버튼을 그룹으로 묶음
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(manRadioButton);
        genderGroup.add(womenRadioButton);

        String[][] columnName = {{"1", "홍길동", "남", "010-1234-5678"},
                {"2", "김철수", "남", "010-2345-6789"}};

        for (String[] row : columnName) {
            StringBuilder rowString = new StringBuilder();
            for (String value : row) {
                rowString.append(value).append(" ");
            }
            dlm.addElement(rowString.toString().trim());
        }

        // 레이블 생성 및 텍스트 설정
        JLabel nameLabel = new JLabel("이름");
        JLabel ageLabel = new JLabel("나이");
        JLabel genderLabel = new JLabel("성별");
        JLabel teleLabel = new JLabel("전화번호");

        nameLabel.setBounds(10, 35, 40, 30);
        nameTextField.setBounds(53, 40, 100, 25);

        ageLabel.setBounds(10, 83, 40, 30);
        ageComboBox.setBounds(53, 83, 100, 30);

        genderLabel.setBounds(10, 120, 40, 30);
        manRadioButton.setBounds(50, 120, 70, 30);
        womenRadioButton.setBounds(120, 120, 70, 30);

        teleLabel.setBounds(10, 155, 70, 30);
        teleTextField.setBounds(75, 161, 120, 25);
        
        addButton.setBounds(68, 241, 70, 30);
        editButton.setBounds(148, 241, 70, 30);
        delButton.setBounds(228, 241, 70, 30);
        exitButton.setBounds(308, 241, 70, 30);

        // JList를 감싸는 JScrollPane을 생성하고 추가
        JScrollPane scrollPane = new JScrollPane(jList);
        scrollPane.setBounds(250, 40, 200, 150);

        add(nameLabel);
        add(nameTextField);

        add(ageLabel);
        add(ageComboBox);

        add(genderLabel);
        add(manRadioButton);
        add(womenRadioButton);

        add(teleLabel);
        add(teleTextField);

        add(scrollPane);
        
        add(addButton);
        add(editButton);
        add(delButton);
        add(exitButton);

        setTitle("숙제");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);  // 레이아웃 매니저를 null로 설정 (수동 배치를 사용할 경우에만 필요)
        setVisible(true);
    }

    public static void main(String[] args) {
        new RunJavaMemo();
        new JavaMemo();
    }
}
