package com.arrays;

public class SumOfArray {
public static void main(String[] args) {
	
	int sum = 0;
	int arr[]=new int[5];
	 
	arr[0]=10;
     
	 arr[1]=10;
	
	 arr[2]=10;
	
	 arr[3]=10;
	
	 arr[4]=10;
	 
	 for(int i=0;i<arr.length;i++) 
	 {
		 sum=sum+arr[i];
	 }
	System.out.println("Addition Of Array Elements: "+sum);
	
}
}
