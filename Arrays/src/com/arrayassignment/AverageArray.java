package com.arrayassignment;
import java.util.Scanner;

public class AverageArray {

public static double calAverage(int arr[]) {
	int sum=0,avg;
	for(int i=0;i<arr.length;i++) {
		
		sum+=arr[i];
		
	}
	avg = sum/arr.length;
	return avg;
	
}	
	
  public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	
	int arr[] = new int[size];
	System.out.println("Enter the element");
	
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	calAverage(arr);
}
}
