package day0207;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class UseFiles {
	
	public void allLines() {
		Path path = Paths.get("c:/dev/temp/java_read.txt");
		System.out.println(path);
		try {
			List<String> lines = Files.readAllLines(path);
//			Iterator<String> iterator = lines.iterator();
//			while (iterator.hasNext()) {
//				String string = (String) iterator.next();
//				
//			}
		} catch (NoSuchFileException e) {
			// TODO Auto-generated catch block
			System.err.println("경로를 확인하세요");
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UseFiles().allLines();
	}//main
}
