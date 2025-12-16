package src;
import java.util.Scanner;
public class GradeCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter test 1 marks : ");
        int test1 = sc.nextInt();
        System.out.println("Enter test 2 marks : ");
        int test2 = sc.nextInt();
        System.out.println("Enter test 3 marks : ");
        int test3 = sc.nextInt();

        float Avg = (test1+test2+test3)/3;
        try{
            if(test1 > 100 || test1 <0 || test2 >100 || test2 <0|| test3 >100 || test3<0)
            {
                throw new Exception("Invalid marks!!! Please enter Valid Marks");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if(Avg >=90)
        {
            System.out.println("Average Marks : "+Avg);
            System.out.println("Grade : A");
        }
        else if(Avg >=75)
        {
            System.out.println("Average Marks : "+Avg);
            System.out.println("Grade : B");
        }
        else if(Avg >= 60)
        {
            System.out.println("Average Marks : "+Avg);
            System.out.println("Grade : C");
        }
        else if(Avg >=40)
        {
            System.out.println("Average Marks : "+Avg);
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Average Marks : "+Avg);
            System.out.println("FAIL");
        }
    }
}
