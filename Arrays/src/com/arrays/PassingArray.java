package com.arrays;

import java.util.Arrays;

public class PassingArray {
static void squareElements(int ar[]) {
	
	
	for(int i=0;i<ar.length;i++) {
		
		ar[i]=ar[i]*ar[i];
		
	}
	System.out.println("insisde method");
	System.out.println(Arrays.toString(ar));
}
public static void main(String[] args) {
	
	int arr[]= {5,8,9,9,3};
	System.out.println(Arrays.toString(arr));
	
	squareElements(arr);
	System.out.println("-----");
	System.out.println(Arrays.toString(arr));
	
}


}
