
//prime number
package com.arrayassignment;
import java.util.*;
public class ArrayAssignment7 {
	
	public static boolean checkPrime(int num) {
		
		if(num<=1) {
			return false;
			
		}
		else {
			
			int count=0;
			for(int i=2;i<=num;i++) {
				if(num%i==0) {
					count++;
					break;
				}
			}
			return count==0;
		}
	}
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int[] arr= new int[sc.nextInt()];
	System.out.println("Enter Elements");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		if(checkPrime(arr[i]))
			System.out.println(arr[i]+" ");
	}
	
	
}
}
