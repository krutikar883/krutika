package com.switchcase;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number ");
		int num1 = sc.nextInt();
		System.out.println("Enter a second number ");
		int num2 = sc.nextInt();
		
		switch(num)
		{
		case 1:
			if(num1 > num2)
			{
				System.out.println(num1 +  " is a greater than second number ");
			}
			else
			{
				System.out.println(num2 +  " is a greater than first number  ");
			}
			break;
		default:
			
			
		}
		

	}

}
