package day0207;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseDataStream {
	
	public void writeData() throws IOException{
		int i = 2024;
		
		DataOutputStream dataOutputStream = null;
		
		try {
			dataOutputStream = new DataOutputStream(new FileOutputStream("c:/dev/temp/data.txt"));
			
//			dataOutputStream.write(i);
			
//			dataOutputStream.writeDouble(2024.02);
			dataOutputStream.writeUTF("오늘은 수요일 입니다");
			dataOutputStream.flush();
			
		} finally {
			// TODO: handle finally clause
			if (dataOutputStream != null) {
				dataOutputStream.close();
			}
		}
	}
	
	public void readData() throws IOException{
		DataInputStream dataInputStream = null;
		
		try {
			dataInputStream = new DataInputStream(new FileInputStream("c:/dev/temp/data.txt"));
//			int readData = dataInputStream.readInt();
			System.out.println(dataInputStream.readUTF());
		} finally {
			// : handle finally clause
			if (dataInputStream != null) {
				dataInputStream.close();
			}
		}
	}
	
	public static void main(String[] args) {
		UseDataStream useDataStream = new UseDataStream();
		
		try {
			useDataStream.writeData();
			System.out.println("쓰기 완료");
			useDataStream.readData();
			System.out.println("읽기 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}//main
}
