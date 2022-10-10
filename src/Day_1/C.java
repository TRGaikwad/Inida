package Day_1;

public class C {
	public static void m1() {

		C.m2();
	}
	public static void m2() {
		System.out.println("This is static m2 method");
	}

	public static void main(String[] args) {
		System.out.println("Main method is started");// 1
		System.out.println("M1 method is started");// 2
		m1();
		System.out.println("M1 method is ended");

	}

}
