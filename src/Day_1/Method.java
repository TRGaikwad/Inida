package Day_1;

public class Method {

	public void div()// Non static
	{
		System.out.println("This is div method");
	}
	public void sub()// Non static
	{
		System.out.println("This is sub method");
	}
	

	public static void main(String[] args) {

		// ClassName objectname=new ClassName();
		Method a = new Method();
		// Objectname.MethodName();
		a.div();

	}

}
