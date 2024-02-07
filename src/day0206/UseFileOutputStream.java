package day0206;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileOutputStream {
	public UseFileOutputStream() throws IOException {
		// TODO Auto-generated constructor stub
		File file = new File("c:/dev/temp/java_write.txt");
		
		FileOutputStream fileOutputStream = null;
		
		try {
			
			fileOutputStream = new FileOutputStream(file);
			
			int data = 65;
			
			fileOutputStream.write(data);
			
			fileOutputStream.flush();
		} finally {
			// TODO: handle finally clause
			if (fileOutputStream != null) {
				fileOutputStream.close();
			}
		}
	}
	public static void main(String[] args) {
		try {
			new UseFileOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
