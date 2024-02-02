package com.arrayassignment;
//print vowels
public class ArrayAssignment8 {
	
public static void checkVowels(char ch[]) {
	for(int i=0;i<ch.length;i++) {
		char ch1;
	if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
		
		
		System.out.println(ch[i]);
		
	}}
	
	
}
public static void main(String[] args) {
	char[] ch = {'a','k','s','h','a','t','a'};
		
		
			checkVowels(ch);
}
}
