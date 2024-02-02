package com.arrayassignment;

import java.util.Arrays;

public class HalfSortArray {

	public static void halfSort(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
	for(int i=0;i<arr.length/2;i++) {
			for(int j=i+1;j<arr.length/2;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
	}
	
	public static void main(String[] args) {
     int[] arr= {2,4,7,5,9,3};
     System.out.println(Arrays.toString(arr));
	 halfSort(arr);
	 //System.out.println(Arrays.toString(arr));
	
	}
	
}
