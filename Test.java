package com.ex.demo;

public class Test {

	public static void main(String[] args) {
		
		Rectangle r=new Rectangle(40,4);
		Rectangle r1=new Rectangle(35.9,3.5);
		
		
		
		System.out.println(r.width);
		System.out.println(r.height);
		System.out.println(r.getArea());
		System.out.println(r1.height);
		System.out.println(r1.width);
		System.out.println(r1.getPerimeter());
	}

}
