package com.arrays;

import java.util.Arrays;

//2.shift all even no at the end of array using temporary array
public class ShiftEvenNumberUsingTemp {
	
	public static void eventemparray(int a[])
	{
		
		int temp[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2!=0) 
			
			temp[index]=a[i];
		     index++;
		}
		
		System.out.println(Arrays.toString(a));
	}
	
public static void main(String[] args) {
	
	int[] arr= {8,2,3,4,5,6,7};
	//System.out.println(Arrays.toString(arr));
	eventemparray(arr);
}
}
