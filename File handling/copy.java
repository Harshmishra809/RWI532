

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {
    public static void main(String[] args)  throws IOException{
        FileInputStream r = new FileInputStream("C:\\Users\\Harsh Mishra\\Desktop\\harsh.txt.file");
        FileOutputStream w = new FileOutputStream("C:\\Users\\Harsh Mishra\\Desktop\\sahil.txt.file");
        int i;
       while((i=r.read())!=-1){
        w.write((char)i);


       }System.out.println("Data copy successfully..!");
    

        
    }
    
}
