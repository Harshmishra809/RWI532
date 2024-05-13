import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
       
        System.out.println("All numbers: ");
        numbers.forEach(System.out::println);
        
      
        List<Integer> filteredNumbers = numbers.stream()
                                                .filter(n -> n > 5)
                                                .collect(Collectors.toList());
        System.out.println("\nNumbers greater than 5: ");
        filteredNumbers.forEach(System.out::println);
        
       
        List<Integer> squaredNumbers = numbers.stream()
                                                .map(n -> n * n)
                                                .collect(Collectors.toList());
        System.out.println("\nSquared numbers: ");
        squaredNumbers.forEach(System.out::println);
        
        
        int sum = numbers.stream()
                        .reduce(0, Integer::sum);
        System.out.println("\nSum of all numbers: " + sum);
    }
}
