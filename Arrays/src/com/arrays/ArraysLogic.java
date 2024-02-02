package com.arrays;

public class ArraysLogic {
static boolean searchelements(int ar[],int ele) 
{
	
	for(int i=0;i<ar.length;i++) {
		
		if(ar[i]==ele)
			return true;
	}
	return false;
}
static void searchElementOccurences(int ar[],int ele) {
	
	boolean flag=false;
	for(int i=0;i<ar.length;i++) {
		
		if(ar[i]==ele) {
			
			flag=true;
			System.out.println("position:"+i);
		}
		
	}
	if(!flag)
		System.out.println("Elelment not found");
}
public static void main(String[] args) {
	
	int arr[]= {4,8,9,6,7,4,9,1};
	if(searchelements(arr,4))
	{
		
		System.out.println("element found");
	}
	
	else 
	{
		
		System.out.println("Elements not found");
	}
	System.out.println("----");
	searchElementOccurences(arr,6);
	
}

}
