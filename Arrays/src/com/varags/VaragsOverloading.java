package com.varags;

public class VaragsOverloading {

	static void display(int ...a1) {
		
		System.out.println("In int");
		for(int x:a1) {
			System.out.println(x);
		}
		
		
	}
static void display(double ...d1) {
		
		System.out.println("In double");
		for(double x:d1) {
			System.out.println(x);
		}
		
		
	}
static void displayMe(int x,char ...ch) {
	
	System.out.println(x);
	for(double c:ch) 
	{
		System.out.println(x);
	}
	
	
}
	
	
	
public static void main(String[] args) {
	
	
	
	
}	
	
}
