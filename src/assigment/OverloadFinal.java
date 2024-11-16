package assigment;

class OverloadFinal {
	
	public void over(int a) {
		System.out.println(a);
	}
	
	public void over(String b) {
		System.out.println(b);
	}  

	public static void main(String[] args) {
		OverloadFinal obj = new OverloadFinal();
		obj.over("Ashu");
	}

}
