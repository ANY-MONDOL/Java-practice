package com.id.bd;

public class ArrayExample {

	public static void main(String[] args) {
		String[] names= {"sema","any","tanvir","juma"};
		int []numbers= {10,20,30,40,50,60,70,80,90,100};
		System.out.println("Array size of name"+names.length);
		System.out.println("Array size of name"+numbers.length);
		
		System.out.println(names[1]);
		System.out.println(numbers[6]);
		
		for(int i=0;i<names.length; i++) {
			System.out.println(names[i]);
	}
	}

}
