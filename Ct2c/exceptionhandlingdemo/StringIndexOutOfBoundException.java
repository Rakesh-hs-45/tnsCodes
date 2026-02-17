package org.tns.capgemini.c2tc.exceptionhandlingdemo;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		String str="hello"; //0,1,2,3,4
		try {
			char ch=str.charAt(5);
			System.out.println(ch);
		}catch (StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
