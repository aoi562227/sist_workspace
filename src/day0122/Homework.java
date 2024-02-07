package day0122;

import java.time.LocalDate;
import java.util.Calendar;

public class Homework {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("일  월  화  수  목  금  토");
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        } 
        for (int day = 1; day <= lastDay; day++) {
            System.out.printf("%2d", day);
            if ((firstDayOfWeek + day - 1) % 7 == 0) {
                System.out.println();
            } else {
                System.out.print("  ");
            }
        }
        System.out.println("\n");
        LocalDate[] lastDays = getLastDaysOfMonth(2024, 1);

        for (LocalDate date : lastDays) {
            System.out.println(date);
        }
    }
    
    private static LocalDate[] getLastDaysOfMonth(int year, int month) {
        LocalDate[] lastDays = new LocalDate[1];

        LocalDate lastDayOfMonth = LocalDate.of(year, month, 1)
                .withDayOfMonth(LocalDate.of(year, month, 1).lengthOfMonth());

        lastDays[0] = lastDayOfMonth;

        return lastDays;
    }
}
