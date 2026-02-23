package org.tns.capgemini.c2tc.java;

public class Demo {

	public static void main(String[] args) {
		int i=1;
		while (i<=100)
		{
			if(i==7 || i==11)
			{
				
				continue;
				
			}
			System.out.println(i);
			i++;
		}
	}

}
