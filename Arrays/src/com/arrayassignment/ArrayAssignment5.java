
//alternate
package com.arrayassignment;
import java.util.*;
public class ArrayAssignment5 {
	
public static void printAlernate(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		if(i%2==0) {
			System.out.println(arr[i]+" ");
		}
	}
}	
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size");
	int[] arr = new int[sc.nextInt()];
	System.out.println("Enter the element");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	printAlernate(arr);
}
}
