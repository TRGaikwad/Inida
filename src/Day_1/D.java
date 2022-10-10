package Day_1;

public class D {
	public void m1() {

		System.out.println("This is non static m1 method");
		m3();
	}

	public static void m2() {
		D d = new D();
		d.m1();
		System.out.println("Thi is non static m2 method");

	}

	public void m3() {
		System.out.println("This is non static m3 method");
	}

	public static void main(String[] args) {
		m2();

	}

}
