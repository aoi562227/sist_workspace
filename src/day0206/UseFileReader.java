package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UseFileReader {

	public UseFileReader() throws IOException{
		// TODO Auto-generated constructor stub
		File readFile = new File("C:\\dev\\temp\\java_read.txt");
		BufferedReader bufferedReader = null;
		
		try{
			bufferedReader = new BufferedReader(new FileReader(readFile));
			
			String str = "";
			while ((str = bufferedReader.readLine()) != null ) {
				System.out.println(str);
			}
		} finally {
			// TODO: handle finally clause
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// main
}
