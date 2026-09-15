// Problem: Java Dequeue (HackerRank)
// Solution: Maintain a sliding window with a deque and a HashSet of distinct values.
import java.util.*;
class JavaDequeue {
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(),m=sc.nextInt(); int[] a=new int[n]; for(int i=0;i<n;i++)a[i]=sc.nextInt(); Deque<Integer> d=new ArrayDeque<>(); Map<Integer,Integer> f=new HashMap<>(); int best=0; for(int i=0;i<n;i++){d.addLast(a[i]);f.put(a[i],f.getOrDefault(a[i],0)+1); if(d.size()>m){int x=d.removeFirst();f.put(x,f.get(x)-1);if(f.get(x)==0)f.remove(x);} if(d.size()==m)best=Math.max(best,f.size());} System.out.println(best); }
}
