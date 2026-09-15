// Problem: Java Hashset (HackerRank)
// Solution: Store each pair in a HashSet; its size is the number of unique pairs.
import java.util.*;
class JavaHashset {
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); Set<String> s=new HashSet<>(); for(int i=0;i<n;i++)s.add(sc.next()+"#"+sc.next()); System.out.println(s.size()); }
}
