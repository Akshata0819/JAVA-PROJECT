package com.arrays;

public class TraverseArray {
public static void main(String[] args) {
	
	int arr[] = new int[5];
	arr[0]=90;
	arr[1]=30;
	arr[2]=49;
	arr[3]=49;
	arr[4]=98;
	//arr[5]=89; //array index out of bound exception
	
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	//array as a literal :-two Ways
	
	//int arr1[] = {8,9,9,8,70};//one way
	
	int arr1[] = new int[] {8,9,9,8,70}; //second way
	
	for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
	
	
	
	
	
	
	
}
}
