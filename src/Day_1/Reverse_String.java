package Day_1;

public class Reverse_String {

	public static void main(String[] args) {
		String a = "abc";
		// 0 to 2
//		int l=a.length();
//		System.out.println(l);
//		
		for (int i = a.length() - 1; i >= 0; i--) {
			// System.out.println(i);
			System.out.print(a.charAt(i));
		}

	}

}
