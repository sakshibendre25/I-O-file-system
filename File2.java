import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 public class File2 {
  public static void main(String[] args) throws IOException
  {
    BufferedReader R1 = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input your name: ");
    String name = R1.readLine();
   System.out.println("Your name is: " + name);

  }


}