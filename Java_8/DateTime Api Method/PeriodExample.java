import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
       
        Period period1 = Period.ofYears(2);
        Period period2 = Period.ofMonths(6);
        Period period3 = Period.ofWeeks(3);
        Period period4 = Period.ofDays(15);
        Period period5 = Period.of(3, 4, 10); 
       
        LocalDate startDate = LocalDate.of(2022, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 5, 13);
        Period periodBetweenDates = Period.between(startDate, endDate);
        
       
        int years = period1.getYears();
        int months = period2.getMonths();
        int days = period3.getDays();
        
     
        System.out.println("Period1: " + period1);
        System.out.println("Period2: " + period2);
        System.out.println("Period3: " + period3);
        System.out.println("Period4: " + period4);
        System.out.println("Period5: " + period5);
        System.out.println("Period between dates: " + periodBetweenDates);
        System.out.println("Years in period1: " + years);
        System.out.println("Months in period2: " + months);
        System.out.println("Days in period3: " + days);
    }
}
