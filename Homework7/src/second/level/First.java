package second.level;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class First {

	public static void main(String[] args) {
		Date date1 = new Date();
		
		Calendar cl = Calendar.getInstance();
		Calendar cl1 = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.println("Write a date dd:MM:yyyy");
		text = sc.nextLine();
		SimpleDateFormat sdfOne = new SimpleDateFormat("dd:MM:yyyy");
		try {
			date1 = sdfOne.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		cl1.setTime(date1);
		
		if(cl1.get(Calendar.DATE) != cl.get(Calendar.DATE)) {
			System.out.println("input date " + cl1.get(Calendar.DATE));
			System.out.println("current date " + cl.get(Calendar.DATE));
			System.out.println();
		}
		if(cl1.get(Calendar.MONTH) != cl.get(Calendar.MONTH)) {
			System.out.println("input month " + cl1.get(Calendar.MONTH));
			System.out.println("present month " + cl.get(Calendar.MONTH));
			System.out.println();
		}
		if(cl1.get(Calendar.YEAR) != cl.get(Calendar.YEAR)) {
			System.out.println("input year " + cl1.get(Calendar.YEAR));
			System.out.println("present year " + cl.get(Calendar.YEAR));
		}
	}
}