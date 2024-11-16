package assigment;

public class NestClass {

	public void thirdclass() {
		System.out.println("Final output");
	}

	public void secondclass() {
		NestClass second = new NestClass();
		second.thirdclass();
	}

	public void firstclass() {
		NestClass first = new NestClass();
		first.secondclass();
	}

	public static void main(String[] args) {
		NestClass original = new NestClass();
		original.firstclass();
	}

}
