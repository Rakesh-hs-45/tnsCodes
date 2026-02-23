package org.tns.capgemini.c2tc.interfacedemo;

public class MarkerInterface {

	public static void main(String[] args) {
		Registerable s= new Student(101,"Neha",12000,"java");
		Registerable s1=new Student(102,"ramu",12000,"java");
		Object obj=new Object();// Object is built-in class that is a part of java.lang package
		if(s instanceof Registerable)
		{
			System.out.println("student is registered for this course");
		}
		else
		{
			System.out.println("student is not registered for this course");
		}

	}

}
