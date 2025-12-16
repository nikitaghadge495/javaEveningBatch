import java.io.File;
import java.io.IOException;

class FileDemo{
    public static void main(String args[]){
     try{
            File f1 = new File("C:\\java program\\fileData\\sample.txt");
            if(f1.createNewFile()){

                System.out.println("New File " +f1.getName()+ " successfully created");
              }
           else
              {
                 System.out.println("File is Allready Existed");
              }

            System.out.println("Path of the file :"+f1.getAbsolutePath());
            System.out.println("Do we have permission to read this file :"+f1.canRead());
            System.out.println("Do we have permission to Write this file :"+f1.canWrite());
            System.out.println("Length of this file :"+f1.length());
            if(f1.delete()){

                System.out.println("New File " +f1.getName()+ " successfully Delete");
              }
           else
              {
                 System.out.println("Error occured during deletion");
              }


        }
      catch(Exception e)
        {
          System.out.println(e);
        }
}
}