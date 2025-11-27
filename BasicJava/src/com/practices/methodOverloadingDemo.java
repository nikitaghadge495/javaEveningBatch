package com.practices;

public class methodOverloadingDemo {

	void add(int n)
	{
		System.out.println("addition of one enumber is : "+n);
	}
	
	void add(int no1,int no2)
	{
		System.out.println("Addition two numbers : "+(no1+no2));
	}
	
	void add(int no1,int no2,int no3)
	{
		System.out.println("Addition three numbers : "+(no1+no2+no3));
	}
	public static void main(String[] args) {
		methodOverloadingDemo t1 = new methodOverloadingDemo();
		t1.add(20);
		t1.add(10, 20, 30);
		t1.add(50,60);

	}

}
