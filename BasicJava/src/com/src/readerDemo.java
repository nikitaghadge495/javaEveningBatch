import java.io.*;
class readerDemo
{
     public static void main(String rags[])
	{

           try{
               Reader r = new FileReader("output.txt");
                           
               int data= r.read();
               while(data!=-1)
                {
                  System.out.print((char)data);
                  data = r.read();
                }
               r.close();
               System.out.println();
               System.out.println("read successfully");
           }
           catch(Exception e)
           {
                System.out.println(e);
            }
}
}