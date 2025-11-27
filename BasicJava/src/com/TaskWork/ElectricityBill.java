package com.TaskWork;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit use");
		int unit = sc.nextInt();
		
		if(unit >300)
		{
			System.out.println("High Use");
		}
		else if(unit <=300 && unit >=100)
		{
			System.out.println("Medium Use");
		}
		else {
			System.out.println("Low Use");
		}
	}

}
