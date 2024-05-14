import java.util.Optional;

public class Optional_Class {
    public  static void main (String[] args) {

        String s = "abc";

        Optional<String> opt = Optional.ofNullable(s);

     if(opt.isPresent());
        System.out.println(opt.get().toUpperCase());
    }
    
}
