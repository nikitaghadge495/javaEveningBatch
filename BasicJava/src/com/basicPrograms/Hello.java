package com.basicPrograms;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Hello java");
         Scanner sc = new Scanner(System.in);
         System.out.println("enter 1st No : ");
         int no1 = sc.nextInt();
         System.out.println("enter 2nd No : ");
         int no2 = sc.nextInt();
         
         
         int result = no1+ no2;
         System.out.println("Addition of two numbers "+no1+" And "+no2+" is a : "+result);
	}
	

}
