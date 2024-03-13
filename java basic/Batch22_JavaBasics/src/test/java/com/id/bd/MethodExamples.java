package com.id.bd;

public class MethodExamples {
	public static void sum(int x, int y) {
	    System.out.println("Summation: "+(x+y));
	}
	public void div(int x, int y) {
	    System.out.println("Division: "+(x/y));
	}
	public void fullname(String firstname, String lastname) {
	    System.out.println("firstname is: "+firstname+" and lastname is:" +lastname);
	}
	public static void main(String[] args) {
		
		MethodExamples obj = new MethodExamples();
		
		
	
	    sum(12,10);
	    obj.div(50,10);
	    obj.fullname("any","mondol");
	    
	    

	}

}
