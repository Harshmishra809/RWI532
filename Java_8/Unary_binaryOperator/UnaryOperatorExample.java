import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        Function<Integer, Integer> myfunction1 = x -> x * x;

        Function<String, String> myfunction2 = str -> str.toLowerCase();

        UnaryOperator<Integer> unaryOperator = x -> x * x;

        System.out.println(unaryOperator.apply(5)); 
    }
}