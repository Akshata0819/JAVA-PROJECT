package com.enhanceforlopp;

import java.util.Arrays;

public class SecondHighest {
static int findSecondHighest(int ar[]) {
	
	int highest = Integer.MIN_VALUE;//ar[0]
	int shighest=Integer.MIN_VALUE;
	
	for(int x:ar) {
		
		if(x>highest) {
			shighest = highest;
			highest=x;
		}
		
		else if(x>shighest) {
			shighest=x;
		}
		
		
	}
	
	/*for(int i=0;i<ar.length;i++){
	if(ar[i]>highest) {
		shighest=highest;
		highest=ar[i];
	}
		else if(ar[i]>shighest) {
			shighest=ar[i];
		}
	}*/

return shighest;

 }
	public static void main(String[] args) {
	
	int arr[]= {-2,-4,-7,-6,-9};
	System.out.println(Arrays.toString(arr));
	int sh = findSecondHighest(arr);
	System.out.println("Second Highest is"+sh);
}
}
