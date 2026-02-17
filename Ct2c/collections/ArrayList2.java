package org.tns.capgemini.c2tc.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		for(int i=1;i<=5;i++)
			al.add(i);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
			

	}

}
