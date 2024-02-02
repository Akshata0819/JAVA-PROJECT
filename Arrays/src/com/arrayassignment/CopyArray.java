

package com.arrayassignment;

import java.util.Arrays;

public class CopyArray {
	
public static void copy(int arr[]) {
	int copy[]=new int[arr.length];
	for(int i=0;i<copy.length;i++) {
		
		copy[i]=arr[i];
	}
	
	System.out.println("Original Array:"+Arrays.toString(arr));
	System.out.println("Copy Of given Array:"+Arrays.toString(copy));
	
}	
public static void main(String[] args) {
int arr[]= {1,2,3,4,5};
copy(arr);

}
}
