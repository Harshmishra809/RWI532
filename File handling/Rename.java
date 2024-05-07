import java.io.File;

public class Rename {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Harsh Mishra\\Desktop\\txt.file");
        File r = new File ("C:\\Users\\Harsh Mishra\\Desktop\\harsh.txt.file");
        if(f.exists())
        {

            System.out.println(f.renameTo(r));
        }
        else{

            System.out.println("file does not exists");
        }



        
    }
    
}
