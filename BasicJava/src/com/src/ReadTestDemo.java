import java.io.*;
class ReadTestDemo{
        public static void main(String args[]){
              
               try{
                    File f1 = new File("C:\\java program\\fileData\\sample.txt");
                   /* if(f1.createNewFile()){
                            System.out.println(f1.getName()+"Successfully Executed");

                     }
                     else
                     {
                        System.out.println("File Already Existed");
                     }*/
                     //System.out.println("Is file Readable : "+f1.canRead());
                     //System.out.println("Is file Writable : "+f1.canWrite());
                     //System.out.println("Is file Executeable : "+f1.canExecute());

                      
                      //f1.setReadable(false);
                      //f1.setWritable(false);
                      f1.setExecutable(true);
                      
                     System.out.println("Is file Readable : "+f1.canRead());
                     System.out.println("Is file Writable : "+f1.canWrite());
                     System.out.println("Is file Executeable : "+f1.canExecute());



                  }
                catch(Exception e)
                   {
                      System.out.println(e);
                   }
      
         }
}