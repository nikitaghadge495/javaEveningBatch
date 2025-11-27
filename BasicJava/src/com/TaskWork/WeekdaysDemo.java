package com.TaskWork;

import java.util.Scanner;

public class WeekdaysDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no between 1 to 7 to see the day..!!!!");
		int no = sc.nextInt();
		
		switch(no) {
		
		 case 1 : System.out.println("ToDay is A... Monday");
		 break;
		 
		 case 2 : System.out.println("ToDay is A... Tuesday");
		 break;
		 
		 case 3 : System.out.println("ToDay is A... wednesday");
		 break;
		 
		 case 4 : System.out.println("ToDay is A... Thrisday");
		 break;
		 
		 case 5 : System.out.println("ToDay is A... Friday");
		 break;
		 
		 case 6 : System.out.println("ToDay is A... Saturday");
		 break;
		 
		 case 7 : System.out.println("ToDay is A... Sunday");
		 break;
		 
		 default: System.out.println("please Enter the Valid No.........");
		}

	}

}
