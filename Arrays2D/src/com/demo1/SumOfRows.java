package com.demo1;

import java.util.Scanner;

public class SumOfRows {
static int[][] findTranspose(int ar[][],int rows,int cols){
		
		
		int tr[][]=new int[cols][rows];
		for(int i=0;i<ar.length;i++) {
			
			for(int j=0;j<ar[i].length;j++) {
				
				tr[j][i]=ar[i][j];
			}
		}
		return tr;
		
	}

public static void findSum(int[][] arr) {
	
	int sum;
	for(int i=0;i<arr.length;i++) {
		sum=0;
		for(int j=0;j<arr[i].length;j++) {
			
			sum+=arr[i][j];
			
		}
		System.out.println("Sum"+sum);
	}
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter rows");
	int rows = sc.nextInt();
		
		
	System.out.println("Enter col");
	int col = sc.nextInt();
		
	int arr[][]=new int[rows][col];
	
	//input the value
	
	System.out.println("-----");
	for(int i=0;i<arr[i].length;i++) {
		
		System.out.println("enter values of rows"+(i+1)+":");
		for(int j=0;j<arr[i].length;j++) {
			
			
			arr[i][j]=sc.nextInt();
		}
		
	}
}
}
