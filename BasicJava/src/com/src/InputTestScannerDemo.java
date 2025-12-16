import java.util.*;
class InputTestScannerDemo{

public static void main(String args[])
{
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter your message :");
     String msg = sc.nextLine();

     System.out.println("Enter your age :");
     int age = sc.nextInt();
     
     System.out.println("Eneter your salary : ");
     Double salary = sc.nextDouble();

     System.out.println("your mesg is : "+msg);
     System.out.println("your age is : "+age);
     System.out.println("your salary is : "+salary);
}
}