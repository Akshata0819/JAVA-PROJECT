package com.arrays;
//find the max and min no from an array and swap their positions.
import java.util.Arrays;

public class FindMaxSwap {
	
	public static void findMax(int[] ar) {
		
		int max=0;
		int min=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>ar[max])
				max=i;
			if(ar[i]<ar[min])
				min=i;
		}
		int temp;
		if(max!=min) {
			temp=ar[min];
			ar[min]=ar[max];
			ar[max]=temp;
		}
		System.out.println(Arrays.toString(ar));
		
	}
public static void main(String[] args) {
	
	int [] arr = {1,2,3,4,5,6};
	System.out.println(Arrays.toString(arr));
	
	findMax(arr);
}
}
