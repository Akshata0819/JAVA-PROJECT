package com.varags;


class Parent{
	
	void display(int...a)
	{
		
		System.out.println("In parent");
	}
}	
	class Child extends Parent
	{
		
		@Override

		void display(int...a) 
		{
			
			System.out.println("In Child");
		}
}
	

public class VargsOverrloading
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.display(5,8,3);
	}
}