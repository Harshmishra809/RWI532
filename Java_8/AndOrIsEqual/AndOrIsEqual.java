import java.util.function.Predicate;

public class AndOrIsEqual {
    public static void main(String[] args) {
      
        Predicate<Integer> isGreaterThanTen = x -> x > 10;
        Predicate<Integer> isEven = x -> x % 2 == 0;

      
        Predicate<Integer> isGreaterThanTenAndEven = isGreaterThanTen.and(isEven);

        Predicate<Integer> isGreaterThanTenOrEven = isGreaterThanTen.or(isEven);

       
        Predicate<String> isEqualToHello = Predicate.isEqual("Hello");

    
        System.out.println("Is 15 greater than 10 and even? " + isGreaterThanTenAndEven.test(15)); 
        System.out.println("Is 8 greater than 10 or even? " + isGreaterThanTenOrEven.test(8)); 
        System.out.println("Is 'Hello' equal to 'Hello'? " + isEqualToHello.test("Hello")); 
    }
}
