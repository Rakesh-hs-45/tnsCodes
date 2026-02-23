package org.tns.capgemini.c2tc.java;

public class TypecastingDemo {

	public static void main(String[] args) {
		//implicit casting
		byte b=127; //1 byte
		int  i=b;     //4 byte
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		//explicit casting or narrowing 
		
		double f1=10.52d;
		long l= (long)f1;
		System.out.println(l);
		
		float f2=34.56f;
		int li=(int) f2;
		System.out.println(li);
		

	}

}
