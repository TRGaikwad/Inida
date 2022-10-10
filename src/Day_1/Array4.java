package Day_1;

public class Array4 {

	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0] = "Java";
		arr[1] = "Selenium";
		arr[2] = "TestNG";
		arr[3] = "BDD";
		arr[4] = "Cucumber";

		String[] abc = { arr[1], arr[3] };
		System.out.println(abc[0]);
		System.out.println(abc[1]);
		System.out.println(abc.length);

	}

}
