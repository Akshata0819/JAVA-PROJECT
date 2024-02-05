package com.arrayassignment;

public class MinCharArray {
	
	
	public static char findMinChar(char[] ch) {
		char min=ch[0];
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]<min) {
				min=ch[i];
		}
		}
		
		return min;
		
	}
public static void main(String[] args) {
	char[] ch= {'e','y','b','k'};
	System.out.println("Minimun character :"+findMinChar(ch));
	
	
}
}
