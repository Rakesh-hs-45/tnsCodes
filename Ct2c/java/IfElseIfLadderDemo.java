package org.tns.capgemini.c2tc.java;

public class IfElseIfLadderDemo {

	public static void main(String[] args) {
		
		int score =101;
		
		if (score>=90)
		{
			System.out.println("Grade A");
		}
		else if (score>=80)
		{
			System.out.println("Grade B");
		}
		else if(score>=70)
		{
			System.out.println("Grade c");
		}
		else if(score>=60)
		{
			System.out.println("Grade d");
		}
		else
		{
			System.out.println("Grade F (Fail)");
		}
	}

}
