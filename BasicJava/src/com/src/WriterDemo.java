import java.io.*;
class WriterDemo
{
     public static void main(String rags[])
	{

           try{
               Writer w = new FileWriter("output.txt");
               String content = "I like to Travel in India\n";
               w.write(content);
               w.append("I like to live in navi Mumabi");
               w.close();
               System.out.println("write successfully");
           }
           catch(Exception e)
           {
                System.out.println(e);
            }
}
}