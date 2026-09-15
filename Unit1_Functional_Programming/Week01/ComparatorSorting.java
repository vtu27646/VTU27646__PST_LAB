/* Week 1 Session 3 | HackerRank: Comparator Sorting */
import java.util.*;
public class ComparatorSorting {
 static class Player{String name;int score;Player(String n,int s){name=n;score=s;}}
 public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();Player[] p=new Player[n];for(int i=0;i<n;i++)p[i]=new Player(s.next(),s.nextInt());Arrays.sort(p,(x,y)->x.score!=y.score?Integer.compare(y.score,x.score):x.name.compareTo(y.name));for(Player x:p)System.out.println(x.name+" "+x.score);}
}
