package org.tns.capgemini.c2tc.java;

public class SwitchDemo {

	public static void main(String[] args) {
		String day="funday";
		
		switch(day)
		{
		case "Monday":
		case "monday":	
		System.out.println("Attend the meeting");
		break;
		
		case "Tuesday":
		case "tuesday":
		System.out.println("work on project task");
		break;
		
		case "wednesday":
		case "Wednesday":
		System.out.println("submit the progress report");
		break;
			
		case "Thursday":
		case "thursday":
		System.out.println("client call and review");
		break;
			
		case "Friday":
		case "friday":
		System.out.println("wrap up weekly task");	
		break;
		
		case "Saturday":
		case "saturday":
		case "Sunday":
		case "sunday":	
		System.out.println("enjoy the weekend");
		break;
	
		default :
			System.out.println("invalid day");
		}

	}

}
