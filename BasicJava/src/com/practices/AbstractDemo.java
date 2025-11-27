package com.practices;

import java.util.Scanner;

abstract class shape{
	 
	 abstract void areaOfShapes();
	
  }
 
 class circle extends shape{
	 Scanner sc = new Scanner(System.in);
	 int radius;
	 double area;
	 circle()
	 {
		 System.out.println("Enter radius : ");
		 radius = sc.nextInt();
	 }
	public void  areaOfShapes(){
		
		area = 3.14*radius*radius;
		 System.out.println("Area of circle is : "+area);
	 }
	 
 }
 
 class rectangle extends shape{
	 Scanner sc = new Scanner(System.in);
	 int length,breadth;
	 double area;
	 rectangle()
	 {
		 System.out.println("Enter length : ");
		 length = sc.nextInt();
		  System.out.println("Enter breadth : ");
		  breadth = sc.nextInt();
	 }
	public void  areaOfShapes(){
		
		area = length * breadth;
		 System.out.println("Area of circle is : "+area);
	 }
	 
 }


public class AbstractDemo {
	

	public static void main(String[] args) {
		
		shape s;
		s = new circle();
		s.areaOfShapes();
		
		s =  new rectangle();
		s.areaOfShapes();
	}

}
