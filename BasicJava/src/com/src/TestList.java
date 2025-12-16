import java.util.*;
import java.lang.*;
class TestList{
      public static void main(String args[]){
      
          ArrayList l1 = new ArrayList();
          l1.add("Nikita");
          l1.add(1010);
          l1.add("pune");
          l1.add("female");
          l1.add(21);
          l1.add("pune");//add elements in last
          
          l1.add(1,"Radha");//add element using index
          
          ArrayList l2 = new ArrayList();
          l2.add("Krishna");
          l2.add(2010);
          l1.addAll(l2); //adding data from another collection at last 
          
          System.out.println(l1);
          Iterator itr =l1.iterator();
          while(itr.hasNext())
            {
               System.out.println(itr.next());
            }
            l1.set(3,"rambhau");
            System.out.println(l1);

     
       }

}