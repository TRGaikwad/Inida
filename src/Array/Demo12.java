package Array;

import java.util.HashMap;
import java.util.Map;

public class Demo12 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Bill");
		hm.put(2, "Tony");
		hm.put(3, "Kerry");
		hm.put(4, "Anthony");
		System.out.println(hm);

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
