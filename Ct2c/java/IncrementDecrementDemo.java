package org.tns.capgemini.c2tc.java;

public class IncrementDecrementDemo {

	public static void main(String[] args) {
		 int a=10;
		 
		 //post increment
		 System.out.println("a++ :" + a++ );//prints first , then increment //10
		 System.out.println("after post-increment of a :"  + a);//11
		 
			 
		 
		 //pre increment
		 System.out.println("++a :" + ++a);
		 
		 //post decrement
		 System.out.println("a--:" + a--); //prints first , then decrement
		 System.out.println("after post-decrement of a" + a);
		 
		 //pre decrement
		 System.out.println("--a" + --a);

	}

}
