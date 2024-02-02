package com.arrayassignment;

import java.util.Arrays;

public class ShiftZeros {
	
	public static void shiftZero(int[] arr) {
		int count = arr.length-1;
		for(int i=arr.length-1;i>=0;i++) {
			if(arr[i]!=0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count--]=0;
			
		}
	}
	
	
public static void main(String[] args) {
	
	int[] arr= {5,4,0,-8,0,6,5,2};
	System.out.println(Arrays.toString(arr));
	shiftZero(arr);
	System.out.println(Arrays.toString(arr));
}
}
