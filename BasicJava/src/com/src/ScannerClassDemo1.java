import java.util.*;
class ScannerClassDemo1{
   public static void main(String args[]){

         Scanner sc = new Scanner("Hello Nikita Ghadge \nyou are so smart \nand you love to live in navi mumbai");
        while(sc.hasNextLine())
         {
             System.out.println(sc.nextLine());
         }
         //System.out.println(sc.nextLine());




}
}