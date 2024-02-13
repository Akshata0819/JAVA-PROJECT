package com.demo1;

public class Array2DExample {

	public static void main(String[] args) {
		
		int arr[] [];
		int [][]arr1;
		
		int rows=3;
		int col=3;
		arr= new int [rows][col];
		
		int no=1;
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<col;j++) {
				arr[i][j]=no;
				no++;
			}
			
			
		}
		System.out.println("-------");
		
		
		for(int i=0;i<rows;i++) {
			
			for(int a:arr[i]) {
				
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
