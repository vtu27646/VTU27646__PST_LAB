// Problem: Day of the Week (LeetCode)
// Solution: Parse the date and return the weekday name in the required format.
import java.time.*;
class DayOfTheWeek {
    public String dayOfTheWeek(int day,int month,int year){ return LocalDate.of(year,month,day).getDayOfWeek().toString(); }
}
