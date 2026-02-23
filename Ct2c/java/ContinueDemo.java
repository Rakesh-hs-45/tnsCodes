package org.tns.capgemini.c2tc.java;

public class ContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<100;i++)
		{
			if(i==5 || i== 45)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
