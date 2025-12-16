package src;

import java.io.FileOutputStream;
public class FileOutputStreamTest
{
    public static void main(String[] args) {
        try{
            FileOutputStream fs = new FileOutputStream("D:\\git_projrct\\learning_corejava\\File Data\\test.txt");
            String s = "Welcome to the IO Programming";
            byte b[] = s.getBytes();
            fs.write(b);
            fs.close();
            System.out.println("Successfully Write the msg");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
