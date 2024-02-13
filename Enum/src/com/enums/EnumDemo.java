package com.enums;

class ContantDirec
{
	
	static final String NORTH="NORTH";
	static final String SOUTH="SOUTH";
	static final String EAST="EAST";
	static final String WEST="WEST";
	
	
	
}
public class EnumDemo
{

	
	public enum Direction{NORTH,EST,SOUTH,WEST};
	public static void main(String[] args) {
		
		Direction d1 = Direction.NORTH;
		System.out.println(d1);
		
		Direction d2 = Direction.NORTH;
		if(d1==d2) {
			
			System.out.println("Equal");
			
		}
		if(d1.equals(d2)) {
			
			
			System.out.println("Equal");
		}
		
		System.out.println("--------");
		
		for(Direction d:Direction.values()) {
			
			
			
		}
		
		
		
		
	}
	
	
	
}
