package org.tns.capgemini.c2tc.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllSetMethods {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<>();
		
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple"); //duplicate will not be added

		//display the set
		System.out.println("Intial set" +set);
		
		//removing an element
		set.remove("Banana");
		System.out.println("Set after removing of 'banana' "+ set);
		
		
		//checking if an element is present
		
		boolean Containcherry=set.contains("Cherry");
		System.out.println("Set contains 'cherry'"+ Containcherry);
		
		
		int size=set.size();
		System.out.println("Size of the set" + size);
		
		//checking if the set is empty
		boolean isEmpty=set.isEmpty();
		System.out.println("is the set empty" +isEmpty ) ;
		
		//clearning elements from the set
		set.clear();
		System.out.println("Set after cleaning" + set);
		
		set.add("Dates");
		set.add("Elderberry");
		
		//iterating over the elemenst of the set
		System.out.println("Iterating over the set");
		Iterator<String> it= set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
	}

}
