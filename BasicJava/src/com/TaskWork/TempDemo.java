package com.TaskWork;

import java.util.Scanner;

public class TempDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temprature");
		int temp = sc.nextInt();
		
		if(temp >= 45)
		{
			System.out.println("Extrem Hot");
		}
		else if(temp <= 44 && temp >= 35)
		{
			System.out.println(" very Hot");
		}
		else if(temp <= 34 && temp >=29)
		{
			System.out.println("Hot");
		}
		else if(temp <=28 && temp >=15) 
		{
			System.out.println("Cold");
			
		}
		else if(temp <= 14 && temp >=4)
		{
			System.out.println("Extrem Cold");
		}
		else {
			System.out.println("temprature in -tve");
		}
			 

	}

}
