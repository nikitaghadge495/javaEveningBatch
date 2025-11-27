package com.controlStatment;

import java.util.Scanner;

public class calcultordemoUsingSwitch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice ,num1,num2;
		
		System.out.println("Enter 1st num : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter 2nd num : ");
		num2 = sc.nextInt();
		
		do {
			
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exits");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("*********************************");
			
			
			
			
			switch(choice)
			{
			    case 1: System.out.println("\nAdditon of "+num1+"and "+num2+"is :"+(num1+num2));
			    break;
			    
			    case 2: System.out.println("Subtraction of "+num1+"and "+num2+"is :"+(num1-num2));
			    break;
			    
			    case 3: System.out.println("Multiplication of "+num1+"and "+num2+"is :"+(num1*num2));
			    break;
			    
			    case 4: System.out.println("Division of "+num1+"and "+num2+"is :"+(num1/num2));
			    break;
			    
			    case 5: System.out.println("Thanks for visiting!!!!!!!!!!");
			    break;
			    
			    default: System.out.println("please enter valid choice");
			}
			
		}while(choice !=5);
		

	}

}
