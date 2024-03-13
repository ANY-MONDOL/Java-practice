package com.id.bd;

public class StaticBlock {
	
	public static void sum(int x, int y) {
	    System.out.println("Summation: "+(x+y));
	}

	public static void main(String[] args) {
		
		System.out.println("first...............");
		sum(10,20);

	}
	static {
		System.out.println("last...............");
	}
	

}
