// Problem: Java Date and Time (HackerRank)
// Solution: Convert the supplied date to Calendar and return its weekday.
import java.util.*;
class JavaDateAndTime {
    static String findDay(int month,int day,int year){ Calendar c=Calendar.getInstance(); c.set(year,month-1,day); String[] names={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"}; return names[c.get(Calendar.DAY_OF_WEEK)-1]; }
    public static void main(String[] args){Scanner sc=new Scanner(System.in);System.out.println(findDay(sc.nextInt(),sc.nextInt(),sc.nextInt()));}
}
