package com.id.bd;

import java.util.ArrayList;

public class ArrayListExamples {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		System.out.println("Size:"+names.size());
		names.add("any");
		names.add("mina");
		names.add("tina");
		names.add("jina");
		names.add("ria");
		
		System.out.println("Size:"+names.size());
		System.out.println(names);
		System.out.println(names.get(3));
		
		for(int i=0;i<names.size(); i++) {
			System.out.println(names.get(i));
	}
       
	}

}
