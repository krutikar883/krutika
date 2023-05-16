package com.switchcase;
import java.util.Scanner;
public class Numbertoword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 to 5");
		int num = sc.nextInt();
		String str ="";
		switch(num)
		{
		case 1:
			str = "One";
			break;
		case 2:
			str = "Two";
			break;
		case 3:
			str = "Three";
			break;
		case 4:
			str = "Four";
			break;
		case 5:
			str = "Five";
			break;
		default:
			str = "Wrong input";
				
		}
		System.out.println(str);
		

	}

}
