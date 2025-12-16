import java.util.*;
class ArrayListDemo{
     public static void main(String args[]){
           ArrayList l1 = new ArrayList();
           l1.add(120);
           l1.add(90);
           l1.add(34);
           l1.add(56);
           l1.add(32);
           System.out.println("ArrayList before sorting : "+l1);
           System.out.println(l1.get(3));

           Collections.sort(l1);
           System.out.println("ArrayList after sorting : "+l1);

           l1.remove(1);
           System.out.println("After removing the element : "+l1);

           ArrayList l2 = new ArrayList();
           l2.add("Nikita");
           l2.add("Harsh");
           l2.add("Gaytri");
           l2.add("pratiksha");
           l2.add("Radha");
           System.out.println("ArrayList before sorting : "+l2);
           
           Collections.sort(l2);
           System.out.println("ArrayList after sorting : "+l2);
          
           l2.remove("Radha");
           System.out.println(l2);
    
          l1.addAll(l2);
          System.out.println("After addAll :"+l1);
          
          l1.removeAll(l2);
          System.out.println("remove All l2 elements from l1 :"+l1);


          ArrayList l3= new ArrayList();
           l3.add(120);
           l3.add(90);
           l3.add(34);
 
           System.out.println("Index of 90 :"+l3.indexOf(90));
           System.out.println("90 is avialbe in l3 :"+l3.contains(90));
       
           l3.clear();
           System.out.println("L3: "+l3);




     }
}