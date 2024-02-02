package com.arrayassignment;
import java.util.Scanner;
public class SearchArray {
	
	
	public static boolean seachArray(int arr[],int num) {
		
		int count = 0;
		boolean flag =false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				count++;
				System.out.println("Array found:"+num+"Index is"+count);
			}
		}
		if(flag==false) {
			
			System.out.println("array not found");
		}
		return true;
	}
	
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[]= {1,2,3,4,5};
	System.out.println("Enter element in array");
	int num = sc.nextInt();
}
}
