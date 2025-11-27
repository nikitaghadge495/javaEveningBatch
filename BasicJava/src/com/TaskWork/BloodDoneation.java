package com.TaskWork;
import java.util.Scanner;
public class BloodDoneation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Weight");
		int weight = sc.nextInt();
        if(age >= 35){
        	   if(weight >=55){
        		   System.out.println("you are eligible for Blood Donetion");
        	   }
        	   else
        	   {
        		   System.out.println("you are Not eligible for Blood Donetion!! Your Weight must be(55+)");
        	   }
        	}else if(age >= 18 )
        	{
               if(weight >=50){
        		   System.out.println("you are eligible for Blood Donetion");
        	   }
        	   else
        	   {
        		   System.out.println("you are Not eligible for Blood Donetion!! Your Weight must be(50+)");
        	   }
        	}
        else
        {
        	System.out.println("you are Not eligible for Blood Donetion!! Your age must be(18+)");
        }
	}

}
