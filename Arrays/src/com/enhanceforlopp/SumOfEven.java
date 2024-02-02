package com.enhanceforlopp;

import java.util.Arrays;

public class SumOfEven {
public static void main(String[] args) {
	
	int ar[]= {4,5,6,8,7};
	System.out.println(Arrays.toString(ar));
	
	int sumE=0;
	for(int x:ar) {
		if(x%2==0) {
			sumE+=x;
			
		}
	}
	
	System.out.println(sumE);
	
	
}
}
