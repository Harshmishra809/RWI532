import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zoned {
    public static void main(String[] args) {
      
        LocalDateTime localDateTime = LocalDateTime.now();
        
       
        ZoneId zoneId = ZoneId.of("America/New_York");
        
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        
  
        System.out.println("Zoned Date Time: " + zonedDateTime);
        
      
        ZonedDateTime currentDateTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date Time in New York: " + currentDateTimeInNewYork);
    }
}
