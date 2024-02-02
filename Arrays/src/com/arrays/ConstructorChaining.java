
//program for Constructorchainnig
package com.arrays;

public class ConstructorChaining {

	ConstructorChaining(){
		this(5);
		System.out.println("default.");
	}
	ConstructorChaining(int no){
		
		this("hii");
		System.out.println("parameterize constructor 1");
	}
	
	ConstructorChaining(String name){
		
		System.out.println("parameterize constructor 2");
	}
	
	
	public static void main(String[] args) {
		
		ConstructorChaining c = new ConstructorChaining();
		
	}
}
