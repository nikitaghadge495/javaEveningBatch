package com.practices;

import java.util.Scanner;

public class countOfdigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int no = sc.nextInt();
		int count =0;
		
		int rev =0,digit;
		
		while(no>0)
		{
			digit = no%10;
			rev = rev*10+digit;
			no = no/10;
			count++;
			
			
		}
		System.out.println("rev no is :"+rev);
		System.out.println("Number of digit present in No  is : "+count);
		
	}

}
