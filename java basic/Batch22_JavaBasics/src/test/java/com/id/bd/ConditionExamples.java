package com.id.bd;

import java.util.Scanner;

public class ConditionExamples {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int a= input.nextInt();
		System.out.println("Enter your 2nd number");
		int b=input.nextInt();
	
	if(a>b){
		System.out.println(a+"is greater than "+b);
	}
	else if(a==b){
		System.out.println(a+"is equal than"+b);
	}
	else if(a<b){
		System.out.println(a+" is less than "+b);
		
	}
	else {
		System.out.println("somthing went wrong......");
	}

	}
}
