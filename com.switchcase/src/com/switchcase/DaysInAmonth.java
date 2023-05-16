package com.switchcase;
import java.util.Scanner;
public class DaysInAmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = 0;
		int days;
		System.out.println("Enter month number");
		month = sc.nextInt();
		switch(month)
		{
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Number of days 30");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days 31");
			break;
		case 2:
			System.out.println("Number of days 29");
			break;
		default:
			System.out.println("Invalid month");
			
				
				
		
		}

			
		
		

	}

}
