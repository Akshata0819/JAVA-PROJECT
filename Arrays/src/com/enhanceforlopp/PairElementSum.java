package com.enhanceforlopp;

public class PairElementSum {
	public static void pairElements(int[]arr,int sum) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) 
			{
				if((arr[i]+arr[j])==sum) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
		
	}
	
public static void main(String[] args) {
	int[] arr= {2,3,5,8,0,7,1,4};
	pairElements(arr,10);
	
}
}
