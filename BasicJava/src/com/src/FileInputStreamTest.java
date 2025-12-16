package src;

import java.io.FileInputStream;

public class FileInputStreamTest
{
    public static void main(String[] args) {
        try{
            FileInputStream fs = new FileInputStream("D:\\git_projrct\\learning_corejava\\File Data\\test.txt");
            int i;
            while((i=fs.read()) != -1)
            {
                System.out.print((char)i);
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
