package com.arrays;

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args)
{
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Odd Elements in Array");
	int arr[] = {9,7,4,8,2};
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]%2!=0)
		
		System.out.println(arr[i]);
		
	}
	System.out.println("Even number is odd");
	
	
	for(int i=0;i<arr.length;i++) 
	{
		
		if(arr[i]%2==0)
		System.out.println(arr[i]);
	}
	sc.close();
}
}
