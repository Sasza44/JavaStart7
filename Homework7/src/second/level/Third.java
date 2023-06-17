package second.level;

public class Third {

	public static void main(String[] args) {
		String a1 = "11111111"; // 1
		String a2 = "12121212"; // 12
		String a3 = "121121121"; // 121
		
		System.out.println(getMinNum(a1));
		System.out.println(getMinNum(a2));
		System.out.println(getMinNum(a3));
	}
	static String getMinNum(String a) {
		boolean b = false; // біт виявлення неспівпадання
		int x = 0; // кількість символів шуканого числа
		String a10 = "";
		do {
			x += 1;
			b = false;
			for(int i = 1; i < a.length() / x; i++) {
				a10 = a.substring(0, x);
				String a11 = a.substring(x * i, x * i + x);
				if(a10.equals(a11) == false) {b = true;}
			}
		} while(a.length() / x > 2 && b == true);
		return a10;
	}
}