package com.arrays;

public class ReplaceNegative {
	
	static void searchElement(int arr[],int ele) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<0) 
			{
				arr[i]=0;
			}
		}
	}
	
	
public static void main(String[] args)
	{
		
	int arr[]= {4,8,3,-2,1,-9,7};
	}
}
