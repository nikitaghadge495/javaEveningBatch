import java.util.*;
class ScannerClassDemo2{
   public static void main(String args[]){

         Scanner sc = new Scanner("Hello Nikita Ghadge\n you are so smart 77");
        while(sc.hasNextLine())
         {
             if(sc.hasNextInt()){
                              
                    System.out.println(sc.nextInt());
             }
             else
              {
                   sc.next();
              } 
            
         }
         //System.out.println(sc.nextLine());




}
}