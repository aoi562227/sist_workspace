package day0205;

import javax.swing.JOptionPane;
import java.io.File;

public class Homework {
	public static void main(String[] args) {
		String filePath = JOptionPane.showInputDialog(null, "삭제할 파일의 경로와 파일명을 입력하세요:");

		File file = new File(filePath);

		int confirmResult = JOptionPane.showConfirmDialog(null, "정말 삭제하시겠습니까?", "삭제 확인", JOptionPane.YES_NO_OPTION);
		if (confirmResult == JOptionPane.YES_OPTION) {
			file.delete();
			JOptionPane.showMessageDialog(null, "파일이 성공적으로 삭제되었습니다.");
		}
	}
}
