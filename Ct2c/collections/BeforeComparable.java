
package org.tns.capgemini.c2tc.collections;

class Person5{
	String name;
	int age;
	
	Person5(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
		void displayInfo()
		{
			System.out.println("Name  " + name+"Age  " +age);
			
		}
	
}


public class BeforeComparable {

	public static void main(String[] args) {
		Person5 person1=new Person5("baskar ",34);
		Person5 person2=new Person5("anil  ",36);
		person1.displayInfo();
		person2.displayInfo();
		
		
		
	}

}
