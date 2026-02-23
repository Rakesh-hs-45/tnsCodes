package org.tns.capgemini.c2tc.java;

public class DatatypeDemo {

	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte" + byteMin + " Max range of byte " + byteMax );
		
		short ShortMax=32767;
		short ShortMin=-32767;
		System.out.println("Min range of short" + ShortMin + " Max range of short" + ShortMax);
		
		int MaxInt=2147483647;
		int MinInt=-2147483647;
		System.out.println("Min range of int" + MinInt + " Max range of int" + MaxInt);
		
		float f=3234.141243278345f;
		double d=3456.14123435463d;
		System.out.println("f value of float datatype" + f + "d value of double" + d);
		
		boolean flag=false;
		System.out.println("boolean value" + flag);
		
		char c='ಗ';
		System.out.println("the char value is  " + c);
	}

}
