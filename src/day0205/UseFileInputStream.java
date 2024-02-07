package day0205;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class UseFileInputStream {
public UseFileInputStream() {
	String directoryPath = JOptionPane.showInputDialog(null, "디렉토리 경로를 입력하세요:");

    // 입력된 디렉토리가 존재하는지 확인
    File directory = new File(directoryPath);
    if (!directory.exists() || !directory.isDirectory()) {
        JOptionPane.showMessageDialog(null, "입력한 경로가 존재하지 않거나 디렉토리가 아닙니다.", "오류", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // 디렉토리 내 모든 파일과 디렉토리 목록을 얻기
    File[] files = directory.listFiles();

    // JTextArea 생성
    JTextArea textArea = new JTextArea(20, 40);

    textArea.append("파일 목록\t수정한 날짜\t유형\t크기\n");

    // 파일과 디렉토리 목록을 JTextArea에 추가
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    for (File file : files) {
        String lastModified = dateFormat.format(file.lastModified());
        textArea.append(file.getName() + "\t" + lastModified + "\t" + getFileType(file) + "\t" + file.length() + "\n");
    }

    // JScrollPane에 JTextArea 추가
    JScrollPane scrollPane = new JScrollPane(textArea);

    // JFrame 생성 및 컴포넌트 추가
    JFrame frame = new JFrame("디렉토리 내 파일 목록");
    frame.add(scrollPane);

    // 프레임 설정
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null); // 화면 중앙에 표시
    frame.setVisible(true);
}

	
	public static void main(String[] args) {
		new UseFileInputStream();
	}//main
	
	public static String getFileType(File filePath) {
        // 파일 경로에서 마지막 점(".")의 위치를 찾기
        int dotIndex = filePath.lastIndexOf(".");
        
        // 마지막 점(".") 뒤의 문자열이 확장자
        if (dotIndex >= 0) {
            return filePath.substring(dotIndex + 1);
        } else {
            // 점(".")이 없는 경우 확장자 없음을 표시
            return "확장자 없음";
        }
    }
}
