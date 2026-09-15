// Problem: Day of the Year (LeetCode)
// Solution: LocalDate handles month lengths and leap years; getDayOfYear returns the answer.
import java.time.*;
class DayOfTheYear {
    public int dayOfYear(String date){ return LocalDate.parse(date).getDayOfYear(); }
}
