package com.arrays;
//3.shift all even no at the end of array w/0 using temporary array
import java.util.Arrays;

public class ShiftEvenNumberwithout {
	
	static void findEven(int[] ar) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=ar.length-1;j>=0;j--) {
				
				if(ar[i]%2==0 && i<j) {
					
					int temp = ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		
}
public static void main(String[] args) {
	
	int[] arr= {2,4,5,7,8,3,6};
	findEven(arr);
	System.out.println(Arrays.toString(arr));
	
	
	
	
}

}
