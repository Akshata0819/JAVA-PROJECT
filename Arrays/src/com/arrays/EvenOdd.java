package com.arrays;

import java.util.Arrays;

public class EvenOdd {
	
	public static void evenodd(int[] arr) {
		int[] evenarr=new int[arr.length/2];
		//int[] evenarr=new int[arr.length];
		int[] oddarr=new int[arr.length];
		
		int indexeven=0,indexodd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				evenarr[indexeven]=arr[i];
				indexeven++;
			}
			else {
				oddarr[indexodd]=arr[i];
				indexodd++;
			}
		}
		System.out.println("Even Array:"+Arrays.toString(evenarr));
		System.out.println("Odd Array:"+Arrays.toString(oddarr));
		
	}
public static void main(String[] args) {
	int[] arr = {78,85,56,45,85,77,88,66};
	evenodd(arr);
	
}
}
