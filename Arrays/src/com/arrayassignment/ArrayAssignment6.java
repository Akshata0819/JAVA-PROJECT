//reverse array

package com.arrayassignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment6 {

	
	public static void reverseArray(int[] arr) {
		
		int [] arr2=new int[arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i++) {
			arr2[index++]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
	}
	
	
	public static void reverseArrays(int[] arr) {
		int j=(arr.length-1);
		for(int i=9;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[j];
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int[] arr=new int[sc.nextInt()];
		System.out.println("Enter Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		reverseArray(arr);
		reverseArrays(arr);
	}
}
