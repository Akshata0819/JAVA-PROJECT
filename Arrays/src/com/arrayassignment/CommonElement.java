package com.arrayassignment;

import java.util.Arrays;

public class CommonElement {
	public static void main(String[] args){

		int[] arr1={1,2,3,4,5};
		int[] arr2={1,5,6,4,9};
		System.out.println("Array1:"+Arrays.toString(arr1));
		System.out.println("Array2:"+Arrays.toString(arr2));
		for(int i=0;i<arr1.length;i++)
		{

		for(int j=0;j<arr2.length;j++)
		{

		if(arr1[i]==arr2[j])
		{

		System.out.println("Common Elements in Array:"+arr1[i]);
		break;
		}
		}
		}

		}
}
