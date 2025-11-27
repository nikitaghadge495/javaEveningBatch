package com.practices;

public class constructordemo {

	int rollno,age;
	String name;
	constructordemo()
	{
		System.out.println("this is a Default constructor");
		System.out.println("details of students....");
	}
	constructordemo(int rollno,String name,int age){
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	void displayInfo()
	{
		System.out.println("Student Roll no : "+rollno+"\nstudent Name : "+name+"\nStudent Age : "+age);
	}
	
	public static void main(String[] args) {
		constructordemo d1 = new constructordemo();
		constructordemo d2 = new constructordemo(1010,"Nikita",22);
		d2.displayInfo();
		
	}

}
