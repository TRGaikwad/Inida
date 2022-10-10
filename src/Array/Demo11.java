package Array;

import java.util.ArrayList;

public class Demo11 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("John");
		arr.add("Tony");
		arr.add("Bill");
		arr.add("Gates");

		System.out.println(arr.size());

		for (String sttr : arr) {
			System.out.println(sttr);
		}

	}
}