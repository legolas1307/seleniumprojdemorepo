package assigment;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		char ch;
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
				count++;
			}
		}
		System.out.println("Vowels count: "+count);
	}

}
