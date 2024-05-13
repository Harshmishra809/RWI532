import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDatetime {
    public static void main(String[] args) {
               LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        
        LocalDateTime dateTime = LocalDateTime.of(2024, 5, 13, 15, 30);
        System.out.println("Custom Date and Time: " + dateTime);

      
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int dayOfMonth = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();
        System.out.println("Year: " + year + ", Month: " + month + ", Day: " + dayOfMonth +
                ", Hour: " + hour + ", Minute: " + minute);

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
