package com.controlStatment;

import java.util.Scanner;

public class SumOfThreeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st No : ");
		int no1 = sc.nextInt();
		
		System.out.println("Enter 2nd No : ");
		int no2 = sc.nextInt();
		
		System.out.println("Enter 3rd No : ");
		int no3 = sc.nextInt();
		
		System.out.println("Addition of "+no1+ " "+no2+" "+no3+" is : "+(no1+no2+no3));
	}

}
