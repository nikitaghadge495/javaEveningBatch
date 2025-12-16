import java.util.*;
class ScannerClassDemo{
   public static void main(String args[]){

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your name :");
         String name = sc.next();
         sc.nextLine();
         System.out.println("Enter your name Again :");
         String name1 = sc.nextLine();
         System.out.println("Your name is :"+name);
	System.out.println("Your name is :"+name1);




}
}