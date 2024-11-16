package assigment;

public class NestedStaticClass {

	public static void displayinfo(String name, int number) {
		NestedStaticClass one = new NestedStaticClass();
		System.out.println("Name: " + name + " number: " + number);
	}

	public static void main(String[] args) {
		NestedStaticClass two = new NestedStaticClass();
		two.displayinfo("abhishek", 30);
	}

}
