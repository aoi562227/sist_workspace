package day0205;

import java.io.File;

public class UseFile3 {
	public static void main(String[] args) {
//		File file = new File("c:/dev/temp/*.txt");
//		
//		System.out.println(file.delete());
		File file = new File("c:/dev/temp/java_read.txt");
		File file2 = new File("c:/dev/temp/java_read2.txt");
		file.renameTo(file2);
	}//main

}
