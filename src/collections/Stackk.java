package collections;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Leopard");
		animals.push("Jaguar");
		animals.push("Cheetah");
		//last in first out, like a bucket	
		
		System.out.println(animals);
		
		System.out.println(animals.peek());
		//print element at the top
		
		animals.pop();
		//pop the element inserted at the last
		System.out.println(animals);
		
		System.out.println(animals.peek());

	}

}
