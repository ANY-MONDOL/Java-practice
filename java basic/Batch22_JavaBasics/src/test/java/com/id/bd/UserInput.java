package com.id.bd;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scan.next();
		System.out.println("Your name is:"+name);
		
		
		System.out.println("Enter your number: ");
		int number =scan.nextInt();
		System.out.println("Your number is:"+number);
		
		System.out.println("Name:"+name+", Number:"+number+" all ok");
		

	}

}
