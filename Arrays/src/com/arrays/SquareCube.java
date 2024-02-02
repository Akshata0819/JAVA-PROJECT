package com.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SquareCube {
public static int[] square(int[] arr) {
	int[] sq =new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		
		sq[i]=arr[i]*arr[i];
	}
	return sq;
}
public static int[] cube(int[] arr) {
	int[] cube=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		
		cube[i]=arr[i]*arr[i]*arr[i];
	}
	return cube;
}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int[] arr=new int[sc.nextInt()];
	System.out.println("enter the element in array");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	System.out.println("Enter Choice");
	System.out.println("1.square\n2.cube");
	switch(sc.nextInt()) {
	
	case 1:
		
		  int sq[]=square(arr);
	      System.out.println(Arrays.toString(sq));
	      break;
	
	case 2:
		int cube[]=cube(arr);
	    System.out.println(Arrays.toString(cube));
	    break;
	
	default:
		System.out.println("exit");
	
	
	
	}
}	
	
}
