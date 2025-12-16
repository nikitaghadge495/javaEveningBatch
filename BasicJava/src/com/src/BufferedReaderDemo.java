import java.io.*;
class BufferedReaderDemo
{
     public static void main(String rags[])
	{

           try{
               Reader r = new FileReader("output.txt");
               BufferedReader br = new BufferedReader(r);           
               int data= br.read();
               while(data!=-1)
                {
                  System.out.print((char)data);
                  data = br.read();
                }
               br.close();
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