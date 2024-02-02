package com.arrayassignment;

import java.util.Arrays;

public class SecondMinimumNumber {
	
	public static int findSecondMin(int[] arr) {
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				secondMin=min;
				min=arr[i];
				
			}
			else if(arr[i]<secondMin && secondMin!=min) {
				secondMin=arr[i];
			}
		}
   return secondMin;		
}
	
	
public static void main(String[] args) {
	int[] arr= {1,2,6,8,7};
	System.out.println(Arrays.toString(arr));
	System.out.println("Second Min :"+findSecondMin(arr));
	
}
}
