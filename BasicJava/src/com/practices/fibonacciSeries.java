package com.practices;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		int no1 =0,no2=1,sum=0;
		int num =10;
		for(int i =2;i<=num;i++)
		{
			sum =no1+no2;
			no1=no2;
			no2=sum;
			System.out.print(sum+" ");
		}
	}

}
