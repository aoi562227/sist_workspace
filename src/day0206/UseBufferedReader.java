package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseBufferedReader {
	
	public UseBufferedReader() throws FileNotFoundException, IOException {
		// TODO Auto-generated constructor stub
		
		File readFile = new File("C:\\dev\\temp\\java_read.txt");
		if (!readFile.exists()) {
			System.out.println(readFile.getAbsolutePath() + "는 존재하지않");
			return;
		}
//		FileInputStream fileInputStream = new FileInputStream(readFile);
//		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(readFile)));
		
		String str = "";
		while ((str=bufferedReader.readLine()) != null) {
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = null;
		
		try {
			new UseBufferedReader();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("디렉터리 에러");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입력에러");

		}finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
	}//main

}
