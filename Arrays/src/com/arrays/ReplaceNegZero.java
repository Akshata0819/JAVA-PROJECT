package com.arrays;

public class ReplaceNegZero {
public static void main(String[] args) {
	
	int[] num= {-6,2,56,41,-8};
	for(int i=0;i<num.length;i++) {
		
		if(num[i]<0) {
			
			num[i]=0;
		
		}
		
	}
	for(int i=0;i<num.length;i++) {
		
		System.out.print(num[i]+" ");
	}
	
}
}
