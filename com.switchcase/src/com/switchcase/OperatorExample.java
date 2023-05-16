package com.switchcase;
import java.util.Scanner;
public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter operator");
		char operator=sc.next().charAt(0);
		switch(operator)
		{
		case '+' :
			System.out.println("addition is " + (num1+num2));
			break;
		case '-' :
			System.out.println("substraction is " + (num1 - num2));
			break;
		case '*' :
			System.out.println("multiplication is " + (num1*num2));
			break;
		case '/' :
			System.out.println("division is " + (num1/num2));
			break;
		
			
			
			
			
			
		}
		

				
	}

}
