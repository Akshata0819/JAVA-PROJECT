package com.arrayassignment;
import java.util.*;
public class TwoArrayAvg {

	public static int average(int[]arr) {
		
		int sum=0;
		int average =0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			average = sum/arr.length;
		}
		return average(arr);
	}
public static double average1(double[]arr) {
		
		double sum=0;
		double average =0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			average = sum/arr.length;
		}
		return average1(arr);
	}
	
public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);	
System.out.println("Enter length");	
int size = sc.nextInt();
int arr[]=new int[size];
System.out.println("enter elements");
for(int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
    average(arr);
	//average1(arr);
}
}
