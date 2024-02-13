package com.enums;
enum Season{SUMMER,WINTER,MONSON};


public class EnumDemo2 {
public static void main(String[] args) {
	
	Season s = Season .SUMMER;
	switch(s) {
	
	case SUMMER:System.out.println("cotton clothes");
	            break;
	            
	case WINTER: System.out.println("wollen cloths");
	             break;
	             
	case MONSON:System.out.println("umbrella and raincoat");
				break;
				
	default:System.out.println("error");
	
	}
}
}
