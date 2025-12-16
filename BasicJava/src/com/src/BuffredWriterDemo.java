import java.io.*;
class BuffredWriterDemo
{
     public static void main(String rags[])
	{

           try{
               Writer w = new FileWriter("output.txt");
               BufferedWriter bw = new BufferedWriter(w);
               String content = "I like to Travel in India\n";
               bw.write(content);
               bw.append("I like to live in navi Mumabi");
               bw.close();
               System.out.println("write successfully");
           }
           catch(Exception e)
           {
                System.out.println(e);
            }
}
}