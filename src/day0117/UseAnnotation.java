package day0117;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class UseAnnotation {
	
	@Deprecated
	public void test() {
		System.out.println("금일은 수요일입니다.");
	}
	
	
	@SuppressWarnings({"unused", "rawtypes"})
	public void test2() {
		int day;
		int j;
		int k;
		
		List list = new ArrayList();
		
	}

	
	public static void main(String[] args) {
		
		UseAnnotation useAnnotation = new UseAnnotation();
		useAnnotation.test();
		Date date = new Date();
		
		System.out.println(date.getYear());
		useAnnotation.test2();
		
		System.out.println(useAnnotation);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		System.out.println(simpleDateFormat);
	}//main
}
