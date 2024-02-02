package com.arrays;
import java.util.*;
public class InputArray {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int size = sc.nextInt();
	
	int arr[]=new int[size];
	
	System.out.println("Enter Elements:");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
		
	}
	System.out.println("---------");
	
	//display the elements
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	sc.close();
}
}
