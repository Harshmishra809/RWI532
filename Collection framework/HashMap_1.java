import java.util.HashMap;  // provide value in key value form
public class HashMap_1 {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("one",1);

        numbers.put("two",  2);

        numbers.put("two", 4); // overide  value
        numbers.put("five",40);

        numbers.put("six",70);
        System.out.println(numbers);

        System.out.println(numbers.isEmpty());  // is empty
        System.out.println(numbers.containsValue(1));  // contains

        System.out.println(numbers.containsKey("one"));
        
      

       

        System.out.println(numbers);   
    

        
    }
    
}
