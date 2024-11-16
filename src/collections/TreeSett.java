package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSett {

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(12);
		set.add(2);
		set.add(43);
		set.add(74);
		set.add(111);
		
		System.out.println(set);
		
		set.remove(43);
		
		System.out.println(set);
		
		System.out.println(set.contains(2));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set);
		
	}

}
