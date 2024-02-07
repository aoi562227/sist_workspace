package day0205;

import java.io.File;

public class UseFile2 {
public static void main(String[] args) {
	File file = new File("c:/dev/lyc");
	System.out.println(file.mkdirs());
	
	File file2 = new File("c:/dev/lyc");
	
}//main
}
