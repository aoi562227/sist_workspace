package day0206;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTyyWithResources {

	public UseTyyWithResources() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
			String data = reader.readLine();
			System.out.println(data);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}//main
	
}
