import java.io.File;
import java.io.IOException;

public class Filehandling {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Harsh Mishra\\Desktop\\txt.file");
        try {
            if (f.createNewFile()) {
                System.out.println("File created successfully");
                System.out.println("file name " +f.getName());

                System.err.println("file Location" +f.getAbsolutePath());


                System.out.println("file Size " +f.length());

                System.out.println("File Readable "+f.canRead());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: ");
        
        }
    }
}
