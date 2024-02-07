package day0119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Homework {

	private String backUpFileName(String fileName) {
		int dotIndex = fileName.lastIndexOf(".");
		if (dotIndex != -1) {
			StringBuilder stringBuilder = new StringBuilder(fileName);
			stringBuilder.insert(dotIndex, "_bak");
			return stringBuilder.toString();
		}
		return fileName + "_bak";
	}

	private String[] csvToStrings(String csvData) {
		StringTokenizer stringTokenizer = new StringTokenizer(csvData, ", ~.김");

		String[] tokens = new String[stringTokenizer.countTokens()];

		int index = 0;
		while (stringTokenizer.hasMoreTokens()) {
			tokens[index++] = stringTokenizer.nextToken();
		}

		return tokens;
	}

	private String intToDateString(int country) {
		String result = "";
		SimpleDateFormat sdf;

		switch (country) {
		case 0:
			sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss EEEE", Locale.KOREA);
			break;
		case 1:
			sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss EEEE", Locale.US);
			break;
		case 2:
			sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss EEEE", Locale.JAPAN);
			break;
		case 3:
			sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss EEEE", Locale.CANADA);
			break;
		default:
			sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss EEEE", Locale.KOREA);
			break;
		}
		result = sdf.format(new Date());
		return result;
	}

	public static void main(String[] args) {
		Homework homework = new Homework();
		System.out.println(homework.backUpFileName("123"));

		String[] tokens = homework.csvToStrings("고한별, 김도원, 김동섭, 김무영~김현종 박시현,손지민,김병년.김일신");

		for (String string : tokens) {
			System.out.println(string);
		}
		System.out.println(homework.intToDateString(0));
	} // main

}
