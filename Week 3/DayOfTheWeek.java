// Problem: Day of the Week (LeetCode)
// Solution: Parse the date and return the full weekday name in LeetCode's required format.
import java.time.*;
import java.time.format.*;
import java.util.*;
class DayOfTheWeek {
    public String dayOfTheWeek(int day,int month,int year){
        return LocalDate.of(year,month,day).getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.ENGLISH);
    }
}
