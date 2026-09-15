// Problem: Sorting: Comparator (HackerRank)
// Solution: Comparator orders Player objects by score descending and name ascending.
import java.util.*;
class ComparatorSorting {
    static class Player { String name; int score; Player(String n,int s){name=n;score=s;} }
    static class Checker implements Comparator<Player>{ public int compare(Player a,Player b){ int c=Integer.compare(b.score,a.score); return c!=0?c:a.name.compareTo(b.name); } }
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); Player[] p=new Player[n]; for(int i=0;i<n;i++)p[i]=new Player(sc.next(),sc.nextInt()); Arrays.sort(p,new Checker()); for(Player x:p)System.out.println(x.name+" "+x.score); }
}
