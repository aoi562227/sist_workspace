package day0205;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseKeyboardInput {

	public UseKeyboardInput() throws IOException {
		// TODO Auto-generated constructor stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String data;
		try {
			data = reader.readLine();
			System.out.println(data);
		} finally {
			if (reader != null)	reader.close();
		}
	}

	public static void main(String[] args) {
		try {
			new UseKeyboardInput();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// main
}
