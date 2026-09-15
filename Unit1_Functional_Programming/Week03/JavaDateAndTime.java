/* Week 3 Session 11 | HackerRank: Java Date and Time */
import java.util.*;import java.time.*;public class JavaDateAndTime{public static void main(String[]x){Scanner s=new Scanner(System.in);int m=s.nextInt(),d=s.nextInt(),y=s.nextInt();System.out.println(LocalDate.of(y,m,d).getDayOfWeek().toString().substring(0,1)+LocalDate.of(y,m,d).getDayOfWeek().toString().substring(1).toLowerCase());}}
