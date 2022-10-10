package Day_1;

public class Array2 {

	public static void main(String[] args) {
		String[] abc = new String[5];
		abc[0] = "Selenium";
		abc[1] = "Java";
		abc[2] = "TestNG";
		abc[3] = "Cucumber";
		abc[4] = "TestNG";

//		for (int i = 0; i < abc.length; i++) {
//			System.out.println(abc[i]);
//		}

		for (String xyz : abc) {
			System.out.println(xyz);
		}
	}

}
