package com.arrayassignment;
//
public class ElementPair {
	
	public static void findElementsPair(int[] arr,int sum) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==sum) {
					
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
			}
			
		}
		
		
	}
	
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8};
	int sum=6;
	findElementsPair(arr,sum);
	
}
}
