package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		//Implement Queue as linkedlist
		
		queue.offer(10);
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
		//insert element
		
		System.out.println(queue);
		
		queue.poll();
		//remove element
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());

	}

}
