package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList<String> studentsName = new ArrayList<>();
		studentsName.add("Abhishek");
		
		List<Integer> list = new ArrayList();
		//Implement List as arraylist
		list.add(1);
		list.add(2);
		
		//List<Integer> listtwo = new LinkedList<>();
		//Implementing List as a linkedlist
		
		System.out.println(list);
		
		list.add(4);
		
		System.out.println(list);
		
		list.add(2, 3);
		//list.add(index,element);
		
		System.out.println(list);
		
		List<Integer> newlist = new ArrayList();
		
		newlist.add(500);
		newlist.add(501);
		newlist.add(502);
		newlist.add(503);
		newlist.add(504);
		newlist.add(505);
		
		list.addAll(1,newlist);
		//list.addAll adds 2 lists
		//list.addAll(index,element);
		System.out.println(list);
		
		System.out.println(list.get(1));
		//get element
		
		list.remove(0);
		//remove element
		System.out.println(list);
		
		list.remove(Integer.valueOf(2));
		//remove specific value
		System.out.println(list);
		
		list.clear();
		//remove full list
		
		System.out.println(list);
		System.out.println(newlist);
		
		newlist.set(0, 499);
		//set a value at 0th index
		System.out.println(newlist);
		
		System.out.println(newlist.contains(499));
		//if the list contains a value
		System.out.println(newlist.contains(500));
		
		for(int i=0;i<newlist.size();i++) 
		{
			System.out.println(newlist.get(i));
		}
		
		for(Integer element: newlist) 
		{
			System.out.println(element);
		}
		
		Iterator<Integer> it = newlist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
