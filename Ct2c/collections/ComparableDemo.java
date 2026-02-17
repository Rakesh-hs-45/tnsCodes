package org.tns.capgemini.c2tc.collections;

import java.util.ArrayList;
import java.util.Collections;

class Person6 implements Comparable<Person6>
{
	String name;
	int age;
	
	
	Person6(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void displayinfo()
	{
		System.out.println("Name " + name + "age   "+ age);
	}


	
	//sort by name
	
	public int compareTo(Person6 other) {
		
		return this.name.compareTo(other.name);
	}
	
}



public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person6> people=new ArrayList<>();
		people.add(new Person6("John",30));
		people.add(new Person6("Anil",20));
		people.add(new Person6("Baskar",17));
		
		Collections.sort(people);
		
		for(Person6 person:people)
		{
			person.displayinfo();
			}

	}

}
