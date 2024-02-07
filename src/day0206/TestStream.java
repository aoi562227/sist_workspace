package day0206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TestStream {
	
	public TestStream() {
		// TODO Auto-generated constructor stub
		BufferedReader bufferedReader = null;
		File file = new File("C:\\dev\\temp\\java_write4.txt");
		File readFile = new File("C:\\dev\\temp\\java_read.txt");
		if (file.exists()) {
			int okOption = JOptionPane.showConfirmDialog(null, "덮어 쓰시겠읍니까");
			if (okOption != JOptionPane.OK_OPTION) {
				return;
			}
		}
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
			bufferedReader = new BufferedReader(new FileReader(readFile));
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
			
			bufferedWriter.flush();

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		new TestStream();
	}//main
}
