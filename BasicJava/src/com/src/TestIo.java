package src;

public class TestIo
{
    public static void main(String[] args) {
        System.out.println("Output Stream");
        System.err.println("Err Stream");
        try{
            int i = System.in.read();
            System.out.println((char)i);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
