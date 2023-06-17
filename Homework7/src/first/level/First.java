package first.level;

import java.util.Date;
import java.util.Calendar;

public class First {

	public static void main(String[] args) {
		Date date = new Date(); // поточна дата
		Date date1 = new Date(); // копія дати
		date1.setMonth(date1.getMonth() - 1); // переміщення копії на місяць назад
		System.out.println(date);
		System.out.println(date1);
		long ms = date.getTime() - date1.getTime(); // обчислення мілісекунд
		System.out.println(ms);
		
		// при використанні класу Calendar дещо неточно розраховуються мілісекунди
		
		Calendar cl = Calendar.getInstance();
		Calendar cl1 = Calendar.getInstance();
		cl1.set(Calendar.MONTH, cl1.get(Calendar.MONTH) - 1);
		Date date2 = cl.getTime(); // поточна дата
		Date date3 = cl1.getTime(); // дата місяць тому
		long ms2 = date2.getTime() - date3.getTime();
		System.out.println(ms2);
	}
}