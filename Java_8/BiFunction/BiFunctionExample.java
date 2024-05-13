import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;

        String result1 = concatenate.apply("Hello, ", "world!");
        String result2 = concatenate.apply("Java ", "8");
        
    
        System.out.println("Concatenated string 1: " + result1);
        System.out.println("Concatenated string 2: " + result2); 
    }
}
