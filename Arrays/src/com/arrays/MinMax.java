
//program to find maxmin element
package com.arrays;

public class MinMax {

	public static void minMax(int[] arr) {
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("maximum number"+max);
		System.out.println("minimum number"+min);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {4,5,6,8,9,3};
		minMax(arr);
		
	}
}
