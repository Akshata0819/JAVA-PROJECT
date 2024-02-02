package com.arrays;

import java.util.Arrays;

public class PassingArrays2 {

	static void squareElements(int ar[]) {
		
		for(int i=0;i<ar.length;i++)
		{
			
			ar[i]=ar[i]*ar[i];
			
		}
		
		System.out.println("Inside method");
		System.out.println(Arrays.toString(ar));
		
	}
	
	public int sumOfElements(int ar[]) {
		
		int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
			
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {8,9,7,5,3};
		int a[]= {7,7,9};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		
		squareElements(arr);
		System.out.println("-----");
		System.out.println(Arrays.toString(arr));
		
		
		squareElements(a);
		System.out.println("-----");
		System.out.println(Arrays.toString(a));
		
		
		PassingArray obj = new PassingArray();
		//obj.sumOfElements({5,9,7,7});
		//anonymous array
		
		//System.out.println("sum is:"+obj.sumOfElements(new int[] {5,9,7,7}));
		int a1[]= {1,2,45,8};
	//	System.out.println("sum is"+obj.sumOfElements(a1));
	}
}
