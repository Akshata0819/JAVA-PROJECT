package com.intermediate;

public class ShiftZeroEnd {
static void shiftZero(int ar[]) {
	
	int count=0;
	for(int i=0;i<ar.length;i++) {
		
		if(ar[i]!=0) {
			ar[count]=ar[i];
			count++;
		}
	}
	
	while(count<ar.length) {
		ar[count++]=0;
	}
}
public static void main(String[] args) {
	
}
}
