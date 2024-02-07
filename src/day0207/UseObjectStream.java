package day0207;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UseObjectStream {
	
	public void writeObject(UserData userData) throws NotSerializableException, IOException {
		ObjectOutputStream objectOutputStream = null;
		
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream("c:/dev/temp/obj.txt"));
			objectOutputStream.writeObject(userData);
			objectOutputStream.flush();
		} finally {
			// TODO: handle finally clause
			if (objectOutputStream!= null) {
				objectOutputStream.close();
			}
		}
	}
	
	public UserData readObject() throws IOException, ClassNotFoundException {
		UserData userData = null;
		
		ObjectInputStream objectInputStream = null;
		
		try {
			objectInputStream = new ObjectInputStream(new FileInputStream("c:/dev/temp/obj.txt"));
			userData = (UserData) objectInputStream.readObject();
		} finally {
			// TODO: handle finally clause
			if (objectInputStream != null) {
				objectInputStream.close();
			}
		}
		
		return userData;
	}
	
	public static void main(String[] args) {
		UseObjectStream useObjectStream = new UseObjectStream();
		
//		UserData userData = new UserData("이예찬", 170.0, 70.0);
//		try {
//			useObjectStream.writeObject(userData);
//			System.out.println("객체 쓰기 완료");
//		}catch (NotSerializableException e) {
//			// TODO: handle exception
//			System.err.println("객체 직렬화가 되지 않는 클래스. 스트림을 타고 JVM밖으로 나갈 수 없다");
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			UserData userData = useObjectStream.readObject();
			System.out.println(userData.getName()+ "님의 키 : " + userData.getHeight() + ", 몸무게 : " + userData.getWeight());
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("파일에 객체가 없습니다");
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//main
}
