package org.tns.capgemini.c2tc.exceptionhandlingdemo;

public class ArrayIndexOutOfBoundExceptionDemo {

	public static void main(String[] args) {
		
		 int arr[]=new int[4] ; //pos start =0 end =3   =5 pos
		 
		 try {
			 int i =  arr[5];
			 System.out.println(i);
		 }catch (ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
		 }
	     

	}

}
