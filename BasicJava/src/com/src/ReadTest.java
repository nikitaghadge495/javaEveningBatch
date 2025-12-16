import java.io.Console;
class ReadTest{
public static void main(String args[]){
      	
      Console c = System.console();
      System.out.println("Enter your name:");
      String name = c.readLine();
      System.out.println("Enter password : ");
      char ch [] = c.readPassword();
      String pass = String.valueOf(ch);
      System.out.println("Welcome "+name);
      System.out.println("your password is : "+pass);

}
}