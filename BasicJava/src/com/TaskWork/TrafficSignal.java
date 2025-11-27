package com.TaskWork;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Traffic signal Light between(Red | Green | Yellow)");
		String color = sc.nextLine();
		
		if(color.equals("red"))
		{
			System.out.println("Stop");
		}
		else if(color.equals("green"))
		{
			System.out.println("Go Now");
		}
		else if(color.equals("yellow"))
		{
			System.out.println("Ready To Go");
		}
		else
		{
			System.out.println("please choose from these colors");
		}

	}

}
