package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueue {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//converts min heap to max heap
		
		pq.offer(5);
		pq.offer(6);
		pq.offer(2);
		pq.offer(8);
		pq.offer(1);
		pq.offer(9);
		
		System.out.println(pq);
		
		pq.poll();
		//smallest element will be removed first
		//if Comparator.reverseOrder is passed in the PriorityQueue constructor,
		//order will be reversed and heap type is reversed
		
		System.out.println(pq);
		System.out.println(pq.peek());
		
	
	}

}
