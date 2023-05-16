package com.switchcase;

import java.util.Scanner;

public class Print1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 to 5");
		int num = sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("1");
			
			
		case 2:
			System.out.println("2");
		
		case 3:
			System.out.println("3");
			
		case 4:
			System.out.println("4");
			
		case 5:
			System.out.println("5");
			break;
		
		
		}

	}

}
