package com.varags;

public class VaragsOverloading {

	static void display(int ...a1) 
	{
		
		System.out.println("In int");
		for(int x:a1) {
			System.out.println(x);
		}
		
		
	}
static void display(double ...d1)
{
		
		System.out.println("In double");
		for(double x:d1) {
			System.out.println(x);
		}
		
		
	}
static void displayMe(int x,char ...ch)
{
	
	System.out.println(x);
	for(double c:ch) 
	{
		System.out.println(c);
	}
	
	
}
static void displayMe(char x,int ...ch) 
{
	
	System.out.println(x);
	for(double c:ch) 
	{
		System.out.println(c);
	}
	
	
}
static void show(Integer...i1) 
{
	
	System.out.println("In Wrapper int");
}

static void show(Character...c1) {
	System.out.println("In wrapper charcater");
}
	
	
public static void main(String[] args) 
{
	display(4,5,6);
	System.out.println("----");
	display(4.4,5.6,6.0);
	System.out.println("----");
	display('a','c','d');
	System.out.println("----");
	
	//displayMe(65,45,30);
	displayMe('a',3,7,9);
	
	
	show(4,5,6);
}	
	
}
