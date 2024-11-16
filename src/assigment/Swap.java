package assigment;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter first variable a:");
		int a = myobj.nextInt();
		System.out.println("a:"+a);
		
		Scanner myobjtwo = new Scanner(System.in);
		System.out.println("Enter first variable a:");
		int b = myobjtwo.nextInt();
		System.out.println("b:"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
//		int c;
//		c=a;
//		a=b;
//		b=c;
		
		System.out.println("Updated values are a:"+a+" and b:"+b );

	}

}
