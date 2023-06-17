package first.level;

public class Second {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		String s = convertToStr(a);
		System.out.println(s);
	}
	static String convertToStr(int[] array) {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i] + ", ");
		}
		sb.delete(sb.length() - 2,  sb.length());
		sb.append("]");
		String str = sb.toString();
		return str;
	}
}