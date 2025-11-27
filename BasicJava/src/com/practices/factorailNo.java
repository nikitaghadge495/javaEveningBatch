package com.practices;

import java.util.Scanner;

public class factorailNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fact =1;
		System.out.println("enter No : ");
		int no = sc.nextInt();
		
		for(int i =1;i<=no;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorail No of "+no+" is : "+fact);

	}

}
