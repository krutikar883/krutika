package com.switchcase;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		switch(num % 2)
		{
			case 0:
				System.out.println("is an even number ");
				break;
			case 1:
				System.out.println("is an odd number ");
		}

	}

}
