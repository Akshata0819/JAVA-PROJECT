package com.enhanceforlopp;
import java.util.*;
public class EnhancedForLoopDemo {
public static void main(String[] args) {
	
	//cannot use:
	//refer index
	//refer updation
	
	int arr[]= {4,5,6,9};
	
	//for(int i=0;i<arr.length;i++) {
	//	System.out.println(arr[i]);
	//}
	for(int x:arr) {
		System.out.println(x);
	}
	Scanner sc = new Scanner(System.in);
	int ar[]= new int[3];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	
	
	
	
	
	
	
	
}
}
