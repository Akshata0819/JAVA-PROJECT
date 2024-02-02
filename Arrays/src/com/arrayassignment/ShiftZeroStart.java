//6> Shift zeros at the beginning of array
package com.arrayassignment;

import java.util.Arrays;

public class ShiftZeroStart {
	public static void shiftZeros(int[] arr) {
		
		int count=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>0) {
				arr[count]=arr[i];
				count--;
			}
		}
		while(count>=0) {
			arr[count--]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
public static void main(String[] args) {
	int[] arr= {5,1,0,9,3,0,8,0,7,2};
	System.out.println(Arrays.toString(arr));
	shiftZeros(arr);
	
	
}
}
