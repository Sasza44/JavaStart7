package second.level;

public class Second {

	public static void main(String[] args) {
		int n = 745;
		int m = 539;
		System.out.println(Integer.toBinaryString(n)); // 0010_1110_1001
		System.out.println(Integer.toBinaryString(m)); // 0010_0001_1011
		String t = Integer.toBinaryString(n^m); // виключаюче або для двох цілих чисел
		System.out.println(t);
		
		int x = 0; // відстань Хемінга
		int[] a = new int[t.length()];
		for(int i = 0; i < t.length(); i++) {
			a[i] = Character.digit(t.charAt(i), 10); // перетворення результату t на масив з нулів та одиниць
			if(a[i] == 1) {
				x += 1;
			}
		}
		System.out.println("H = " + x);
	}
}