package first.level;

public class Fourth {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int i1 = i + 1;
			String text = String.format("PI = %." + i1 + "f", Math.PI);
			System.out.println(text);
		}
	}
}