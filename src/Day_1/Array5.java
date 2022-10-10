package Day_1;

public class Array5 {

	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0] = "Java";
		arr[1] = "Selenium";
		arr[2] = "BDD";
		arr[3] = "Cucumber";
		arr[4] = "TestNg";

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
