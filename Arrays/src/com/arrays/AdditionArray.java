package com.arrays;

import java.util.Arrays;

public class AdditionArray {
public static void main(String[] args) {
	
	int[] arr1= {1,2,3,1,2};
	int[] arr2= {4,5,6,1,2};
	int[] sum=new int[arr1.length];
	for(int i=0;i<arr1.length;i++) {
		
		sum[i]=arr1[i] + arr2[i];
		
				
	}
	
	//for(int i=0;i<sum.length;i++) {
		
		System.out.print(Arrays.toString(sum));
	//}
}
}
