package day0122;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class UseCalender {
	public UseCalender() {
		Calendar calendar = Calendar.getInstance();

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		String[] dayOfWeekArr = new String[] { "", "일", "월", "화", "수", "목", "금", "토" };
		String dayOfWeekStr = dayOfWeekArr[dayOfWeek];

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(year).append("년 ").append(month + 1).append("월 ").append(day).append("일 ")
				.append(dayOfWeekStr).append("요일 ").append((calendar.get(Calendar.AM_PM) == Calendar.AM) ? "오전" : "오후")
				.append(calendar.get(Calendar.HOUR_OF_DAY)).append("시 ").append(calendar.get(Calendar.MINUTE))
				.append("분 ").append(calendar.get(Calendar.SECOND)).append("초");
		System.out.println(stringBuilder);

		calendar.set(Calendar.YEAR, 2023);
		calendar.set(Calendar.MONTH, Calendar.MARCH);
		calendar.set(Calendar.DAY_OF_MONTH, 3);
		calendar.set(Calendar.HOUR_OF_DAY, 2);
		calendar.set(Calendar.MINUTE, 30);
		calendar.set(Calendar.AM_PM, Calendar.PM);

		System.out.println(calendar.get(Calendar.YEAR) + "년 " + (calendar.get(Calendar.MONTH) + 1) + "월 "
				+ calendar.get(Calendar.DAY_OF_MONTH) + "일 " + calendar.get(Calendar.HOUR) + "시 "
				+ calendar.get(Calendar.MINUTE) + "분 " + ((calendar.get(Calendar.AM_PM) == Calendar.AM) ? "오전" : "오후"));
	}

	public static void main(String[] args) {
		new UseCalender();
	}// main
}
