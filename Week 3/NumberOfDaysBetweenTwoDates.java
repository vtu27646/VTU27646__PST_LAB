// Problem: Number of Days Between Two Dates (LeetCode)
// Solution: Parse both ISO dates and use the absolute ChronoUnit day difference.
import java.time.*;
class NumberOfDaysBetweenTwoDates {
    public int daysBetweenDates(String date1,String date2){ LocalDate a=LocalDate.parse(date1),b=LocalDate.parse(date2); return (int)Math.abs(java.time.temporal.ChronoUnit.DAYS.between(a,b)); }
}
