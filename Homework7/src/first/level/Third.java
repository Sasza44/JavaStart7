package first.level;

import java.util.Arrays;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Write binary number");
		x = sc.nextInt(); // введене бінарне число
		StringBuilder sb = new StringBuilder(Integer.toString(x));
		sb = sb.reverse(); // реверс введеного бінарного числа
		
		int x1 = 0; // готове десяткове число
		int[] a = new int[sb.length()]; // перетворення реверсивного бінарного числа на масив
		for(int i = 0; i < a.length; i++) {
			a[i] = Character.digit(sb.charAt(i), 2); // перетворення кожного символа на число
			x1 += a[i] * Math.pow(2, i); // формування доданків десяткового числа
		}
		System.out.println(x1);
	}
}