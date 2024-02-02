
//find cube of each number
package com.arrayassignment;
import java.util.*;
public class AraayAssignment2 {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	
	int[] arr = new int[sc.nextInt()];
	
	System.out.println("Enter element");
	for(int i=0;i<arr.length;i++) {
		
		arr[i]=sc.nextInt();
		
	}
	printcube(arr);
}
	
	public static void printcube(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*arr[i]*arr[i];
		}
		System.out.println(Arrays.toString(arr));
		
	
}
}
