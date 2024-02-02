
//Search the element in an array 
package com.arrayassignment;
import java.util.*;
public class ArrayAssignment3 {

	public static boolean searchElement(int[]arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return true;
			}
		}
	
	return false;
	
	}
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
   int[] arr = new int[sc.nextInt()];
   System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter element you want check:");
		int n = sc.nextInt();
		if(searchElement(arr, n))
			System.out.println("element of array is found");
		else
			System.out.println("element not found");
	}
}
