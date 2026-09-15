/* Week 2 Session 10 | HackerRank: Java Hashset */
import java.util.*;public class JavaHashset{public static void main(String[]x){Scanner s=new Scanner(System.in);int n=s.nextInt();Set<String>set=new HashSet<>();while(n-->0){set.add(s.next()+" "+s.next());System.out.println(set.size());}}}
