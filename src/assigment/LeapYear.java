package assigment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter year:");
		int a = myobj.nextInt();
		System.out.println("year:" + a);

		if (a % 4 == 0) {
			if (a % 100 == 0) {
				if (a % 400 == 0) {
					System.out.println(a + " is a leap year.");
				}
			}
			System.out.println(a + " is a leap year.");
		}
		else 
			System.out.println(a+" is not a leap year.");
	}
}
