package com.arrayassignment;

import com.arrays.SumOfEven;

public class ArrayAssignment1 {

	public int oddsum(int[] arr)
	 {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) 
				
				sum+=arr[i];
				
		}
		return sum;
		}
		
	public static void main(String[] args) {
		{
	}
	SumOfEven s = new SumOfEven();
	int [] arr= {3,8,9,0,8};
	
	System.out.println("Sum Of Odd Number :"+s.evensum(arr));
	
	
	}
	
	

}
