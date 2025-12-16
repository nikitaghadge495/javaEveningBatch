import java.util.*;

class PersonInfo{
     int id;
     String name;
     int age;
     String city;
     PersonInfo(int id,String name,int age,String city){
   
              this.id = id;
              this.name = name;
              this.age = age;
              this.city = city;
          }   
}

class TestPersonList{

         public static void main(String args[]){
                PersonInfo p1 = new PersonInfo(1010,"Nikita",21,"pune");
                PersonInfo p2 = new PersonInfo(2010,"Gayatri",22,"mumbai");
                PersonInfo p3 = new PersonInfo(3010,"pratiksha",23,"nagpur");
                PersonInfo p4 = new PersonInfo(4010,"Krisha",20,"pune");
                 
               ArrayList<PersonInfo>l1 = new ArrayList<PersonInfo>();
               l1.add(p1);
               l1.add(p2);
               l1.add(p3);
               l1.add(p4);
              
              Iterator itr = l1.iterator();
              while(itr.hasNext()){
   
                PersonInfo p = (PersonInfo)itr.next();
                System.out.println("id : "+p.id+" name :"+p.name+" age :"+p.age+" city : "+p.city);
             }



 
               


          }
  
}