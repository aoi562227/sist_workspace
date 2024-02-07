package day0207;

import java.io.NotSerializableException;
import java.io.Serializable;

public class UseInstanceof {

	public void useInstanceof(UserData userData) throws NotSerializableException {
		// TODO Auto-generated constructor stub
		if (!(userData instanceof Serializable)) {
			throw new NotSerializableException("직렬화 하고 오세요");
		}
		System.out.println(userData.toString());
	}
	
	public static void main(String[] args) {
		UserData userData = new UserData();
		UseInstanceof useInstanceof = new UseInstanceof();
		try {
			useInstanceof.useInstanceof(userData);
		} catch (NotSerializableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main
}
