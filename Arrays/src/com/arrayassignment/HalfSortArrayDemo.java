package com.arrayassignment;

import java.util.Arrays;

public class HalfSortArrayDemo {
	
	public static void halfSort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length/2;j++) {
				
				if(arr[j]<arr[i]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			
		}
		
		for(int i=1;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				
				if(arr[j]>arr[i]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			
		}
		
		
		
	}
	
	
	
	
public static void main(String[] args) {
	int[] arr= {4,5,6,7,1,2,4,5,6,9,0};
	System.out.println(Arrays.toString(arr));
}
}
