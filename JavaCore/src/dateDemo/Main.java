package dateDemo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date today = new Date();
		Date anotherDay = new Date();
		

		today.getTime();
		anotherDay.setTime(1000);
		System.out.println("Today: " + today.toString());
		System.out.printf("%s %tB %<te, %<tY", "Today is: ", today);
		System.out.println("");
		System.out.printf("%s %tB %<te, %<tY", "Another Day is: ", anotherDay);
		System.out.println("");
		System.out.println("Today compare to another day: " + today.compareTo(anotherDay));
	}

}
