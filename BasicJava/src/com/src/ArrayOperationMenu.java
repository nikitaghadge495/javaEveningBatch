package src;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperationMenu
{
    public static void Display(int arr[])
    {
        int n = arr.length;
        System.out.println("Array elements are : ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void max(int arr[])
    {
        int n = arr.length;
        int max = arr[0];
        for(int i =1;i<n;i++)
        {
           if(arr[i] > max)
           {
               max = arr[i];
           }
        }
        System.out.println("Max of Array is : "+max);
    }
    public static void search(int arr[],int no)
    {
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            if(arr[i]==no)
            {
                System.out.println("number is fount in Array :"+no);
            }

        }
        System.out.println("Number is not found");
    }
    public static void sumOfArray(int arr[])
    {
        int n = arr.length;
        int sum =0;
        for(int i = 0;i<n;i++)
        {
            sum +=arr[i];
        }
        System.out.println("sum of Array Element is : "+sum);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice ;
        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        try{
            if(size >100 || size <=0)
            {
                throw new Exception("Invalid Size of array!!!!! Enter the valid No of Size");
            }
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter the array Elements : ");
        int  arr [] = new int [size];
        for(int i =0;i<size;i++)
        {
            arr[i] =sc.nextInt();
        }
        do{

            System.out.println("1.Display");
            System.out.println("2.Max");
            System.out.println("3.sum");
            System.out.println("4.search");
            System.out.println("5.Exit");

            System.out.println("Enter your choice in between 1 to 5 :");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1 : Display(arr);
                break;

                case 2 : max(arr);
                break;

                case 3 : sumOfArray(arr);
                break;

                case 4:
                        System.out.println("Enter the Element for search");
                        int no = sc.nextInt();
                        search(arr,no);
                break;
                case 5:
                    System.out.println("Thanks for using my Application");
                break;

                default: System.out.println("Enter the valid choice");
            }
        }while(choice != 5);
    }
}
