import java.io.File;
 
public class File3 {
 
      public static void main(String[] args) 
      {
        File f1 = new File("/home/students/test.txt");
        if(f1.exists())
        {
        System.out.println(filesize_in_Bytes(file));
        System.out.println(filesize_in_kiloBytes(file));
        System.out.println(filesize_in_megaBytes(file));
        }
        else 
        System.out.println("File doesn't exist");
         
    }
 
    private static String filesize_in_megaBytes(File file) {
        return (double) f1.length()/(1024*1024)+" mb";
    }
 
    private static String filesize_in_kiloBytes(File file) {
        return (double) f1.length()/1024+"  kb";
    }
 
    private static String filesize_in_Bytes(File file) {
        return f1.length()+" bytes";
    }
 }