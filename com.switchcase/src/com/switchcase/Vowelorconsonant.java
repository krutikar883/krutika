package com.switchcase;
import java.util.Scanner;
public class Vowelorconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next ().charAt(0);
		switch (ch)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("is a vowel");
			break;
		default:
			System.out.println("is a consonant");
		}

	}

}
