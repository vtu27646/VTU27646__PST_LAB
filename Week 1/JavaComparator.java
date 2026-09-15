// Problem: Java Comparator (HackerRank)
// Solution: Implement Comparator<Player> with the required descending-score and alphabetical-name rules.
import java.util.*;
class JavaComparator {
    static class Player { String name; int score; Player(String n,int s){name=n;score=s;} }
    static class Checker implements Comparator<Player>{ public int compare(Player a,Player b){ int c=Integer.compare(b.score,a.score); return c!=0?c:a.name.compareTo(b.name); } }
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); List<Player> p=new ArrayList<>(); for(int i=0;i<n;i++)p.add(new Player(sc.next(),sc.nextInt())); p.sort(new Checker()); for(Player x:p)System.out.println(x.name+" "+x.score); }
}
