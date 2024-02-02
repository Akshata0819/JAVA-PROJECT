
//Find Maximum number in an array
package com.arrayassignment;
import java.util.*;
public class ArrayAssignment4 {
	
	public static int maxNumber(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size");
	int[] arr=new int[sc.nextInt()];
	System.out.println("Enter Elements:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Maximum Number:"+maxNumber(arr));
}

}
