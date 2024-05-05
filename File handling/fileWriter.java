import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {

        try {
            FileWriter f = new FileWriter("C:\\Users\\Harsh Mishra\\Desktop\\txt.file");
try {
f.write("Harsh Mishrab   ");

}
finally {
    f.close();


}
System.out.println("Successfull data write in file");

        }

        catch(IOException i) {

            {

                System.out.println(i);
            }


        }
        
    }
    
}
