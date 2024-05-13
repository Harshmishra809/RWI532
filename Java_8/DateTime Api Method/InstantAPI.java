import java.time.Instant;


public class InstantAPI {
    public static void main(String[] args) {
        long CurrentTimeMillis = System.currentTimeMillis();
        System.out.println(CurrentTimeMillis);
        

        Instant now = Instant.now();
        System.out.println(now);
      

    }
}