/* Week 3 Session 12 | LeetCode: Day of the Year */
import java.time.*;import java.util.*;public class DayOfTheYear{public int dayOfYear(String d){return LocalDate.parse(d).getDayOfYear();}public static void main(String[]x){Scanner s=new Scanner(System.in);System.out.println(new DayOfTheYear().dayOfYear(s.next()));}}
