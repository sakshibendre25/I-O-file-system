import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class File1 {
 
    public static void main(String args[]){
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("/home/students/test.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        } 

         catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

           catch (IOException e) {
            System.out.println("Unable to read the file.");
        }
     }
}