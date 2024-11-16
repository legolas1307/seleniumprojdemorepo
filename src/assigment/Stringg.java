package assigment;

public class Stringg {

	public static void main(String[] args) {
		
		String str = "Welcome To AutomatioN";

	    System.out.println(

	        "Letters in upperCase: " +

	            str.chars().filter(Character::isUpperCase).count() +

	            "\n" +

	            "Letters in lowerCase: " +

	            str.chars().filter(Character::isLowerCase).count()

	    );
//		int upper = 0;
//		int lower = 0;
//		
//		for(int i=0;i<s.length();i++) 
//		{
//			char ch = s.charAt(i);
//			if(ch>=65 && ch<=90) 
//			{
//				upper++;
//			}
//			else 
//			{
//				lower++;
//			}
//		}
//		System.out.println("Upper case count: "+upper);
//		System.out.println("lower case count: "+lower);

	}

}
