import java.time.Duration;

public class DurationExample {
    public static void main(String[] args) {
       
        Duration duration1 = Duration.ofDays(5);
        Duration duration2 = Duration.ofHours(10);
        Duration duration3 = Duration.ofMinutes(30);
        
      
        Duration result1 = duration1.plus(duration2);
        Duration result2 = duration1.minus(duration3);
        
      
        long seconds = duration1.getSeconds();
        long minutes = duration2.toMinutes();
        long hours = duration3.toHours();
        long millis = duration1.toMillis();
        long nanos = duration2.toNanos();
        
       
        boolean isZero = duration1.isZero();
        boolean isNegative = duration2.isNegative();
        
       
        System.out.println("Result of adding durations: " + result1);
        System.out.println("Result of subtracting durations: " + result2);
        System.out.println("Seconds in duration1: " + seconds);
        System.out.println("Minutes in duration2: " + minutes);
        System.out.println("Hours in duration3: " + hours);
        System.out.println("Milliseconds in duration1: " + millis);
        System.out.println("Nanoseconds in duration2: " + nanos);
        System.out.println("Is duration1 zero? " + isZero);
        System.out.println("Is duration2 negative? " + isNegative);
    }
}
