package day0122;

import java.text.DecimalFormat;

public class UseDecimalFormat {
	public UseDecimalFormat() {
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###");
		System.out.println(decimalFormat.format(232323));
	}
	
	public static void main(String[] args) {
		new UseDecimalFormat();
	}//main
}
