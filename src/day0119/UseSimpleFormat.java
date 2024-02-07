package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UseSimpleFormat {
	public UseSimpleFormat() {
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd a kk:mm:ss EEEE", Locale.JAPAN);
		System.out.println(sdf.format(new Date()));
	}
	
	public static void main(String[] args) {
		new UseSimpleFormat();
	}//main
}
