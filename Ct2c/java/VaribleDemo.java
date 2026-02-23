package org.tns.capgemini.c2tc.java;

public class VaribleDemo {
			int a=10;//instance variable
			void print()
			{
				String msg="hello";//local variable
				System.out.println(msg);
			}
	
	static String message="hello students" ;//static variable
	
	public static void main(String[] args) {
		VaribleDemo obj=new VaribleDemo(); 
		System.out.println("the value of a is "+obj.a);
		obj.print();
		System.out.println(message);

	}

}
