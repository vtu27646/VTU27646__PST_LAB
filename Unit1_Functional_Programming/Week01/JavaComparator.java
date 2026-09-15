/* Week 1 Session 3 | HackerRank: Java Comparator */
import java.util.*;
public class JavaComparator {
 static class Player{String name;int score;Player(String n,int s){name=n;score=s;}}
 public static void main(String[] a){Scanner s=new Scanner(System.in);int n=s.nextInt();List<Player> p=new ArrayList<>();while(n-->0)p.add(new Player(s.next(),s.nextInt()));p.sort((x,y)->x.score!=y.score?Integer.compare(y.score,x.score):x.name.compareTo(y.name));for(Player x:p)System.out.println(x.name+" "+x.score);}
}
