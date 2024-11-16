package collections;

import java.util.ArrayDeque;

public class ArrayDequee {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.offer(5);
		ad.offer(6);
		ad.offer(2);
		ad.offer(3);
		ad.offer(9);
		ad.offerFirst(100);
		ad.offerLast(200);
		ad.offer(300);
		//adds at first and last index
		System.out.println(ad);
		
		System.out.println(ad.peek());
		
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		
		System.out.println(ad);
		
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		

	}

}
