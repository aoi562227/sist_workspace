package day0208;

import java.beans.XMLDecoder;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Base64.Decoder;

public class TestURLEncoder {
	public static void main(String[] args) {
		String str = "즐거운 설명절 되세요.";
		System.out.println("원본 : "+str);
		try {
			String encode = URLEncoder.encode(str, "UTF-8");
			System.out.println("인코딩 : " + encode);
			
			String decode = URLDecoder.decode(encode, "UTF-8");
			System.out.println("디코딩 : " + decode);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}//main
}
