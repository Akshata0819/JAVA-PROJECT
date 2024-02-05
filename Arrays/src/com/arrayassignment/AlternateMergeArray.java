package com.arrayassignment;
//merge the alternate element in array
import java.util.Arrays;

public class AlternateMergeArray {
static int[] mergeAlternate(int a1[],int a2[]) {
	
	int len1=a1.length;
	int len2=a2.length;
	int mar[]=new int[len1+len2];
	
	int i,j,index;
	index=0;
	for(i=0,j=0;i<len1&&j<len2;i++,j++) {
		mar[index++]=a1[i];
		mar[index++]=a2[j];
	}
	while(i<len1) {
		mar[index++]=a1[i++];
		
	}
	while(j<len2) {
		mar[index++]=a2[j++];
	}
	return mar;
}
public static void main(String[] args) {
	int arr1[]= {6,7,12,5};
	int arr2[]= {10,20,30,40,90,100};
	System.out.println("Before merge:");
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	
	int m[]=mergeAlternate(arr1,arr2);
	System.out.println("After complete merge:");
	System.out.println(Arrays.toString(m));
}
}
