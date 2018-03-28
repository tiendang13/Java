package calendarDemo;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
        System.out.println("Ngay gio hien tai: " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 ngay sau: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 thang sau: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 nam sau: " + calendar.getTime());

        int maximum = calendar.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Gia tri MAX cua so ngay trong tuan: " + maximum);
        maximum = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("Gia tri MAX cua so tuan trong nam: " + maximum);

        int minimum = calendar.getMinimum(Calendar.DAY_OF_WEEK);
        System.out.println("Gia tri MIN cua so ngay trong tuan: " + minimum);
        maximum = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        System.out.println("Gia tri MIN cua so tuan trong nam: " + minimum);

	}

}
