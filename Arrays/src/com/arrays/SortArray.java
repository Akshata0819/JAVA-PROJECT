package com.arrays;

import java.util.Arrays;

public class SortArray {

public static void main(String[] args) {
	
	int arr[]=new int []{10,54,5,8,80,65};
	
	Arrays.sort(arr);
	
	System.out.println("element of array sorted are:");
	for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
	}
}
}
