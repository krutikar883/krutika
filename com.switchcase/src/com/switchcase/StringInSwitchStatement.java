package com.switchcase;
import java.util.Scanner;
public class StringInSwitchStatement {
//program for switch expression is of string type
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String day = sc.next();
		switch(day) {
		
	      case "Monday":
	        System.out.println("Working Day");
	        break;
	      case "Tuesday":
	        System.out.println("Foodie Day");
	        break;
	      case "Wednesday":
	        System.out.println("Travelling");
	        break;
	      case "Thursday":
	        System.out.println("Shopping");
	        break;
	      case "Friday":
	        System.out.println("Movie Day");
	        break;
	      case "Saturday":
	        System.out.println("Weekend");
	        break;
	      case "Sunday":
	        System.out.println("Photography");
	        break;
	      default:
	        System.out.println("Error, day does not exist");
	        break;
				
				
		}
		
		

	}

}
