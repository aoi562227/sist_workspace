package day0206;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UseBufferedWriter {
	
	public UseBufferedWriter() {
		// TODO Auto-generated constructor stub
		File file = new File("C:\\dev\\temp\\java_write2.txt");
		
		try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
			String msg = "이것이 자바다";
			bufferedWriter.write(msg);
			bufferedWriter.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new UseBufferedWriter();
	}//main

}
