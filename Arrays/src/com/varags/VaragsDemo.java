package com.varags;

public class VaragsDemo {

	
	//rule1:we can have only 1  vargs
	//static void display(int ...a,String ...s) {
		
		
		
	//}
	
	//rule 2:last argument in the method
	//static void meth1(int n1,int ...a,int n2) {
		
		
		
//	}
	
	static void meth1(int n1,int n2,int...a) {
		
		System.out.println(n1);
		System.out.println(n2);
		for(int x:a) {
			System.out.println(x);
		}
		
	}
public static void main(String[] args) {
	
	
	meth1(2,3,222);
	
}
}
