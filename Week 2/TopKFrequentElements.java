// Problem: Top K Frequent Elements (LeetCode)
// Solution: Count frequencies and keep the k most frequent values in a min-heap.
import java.util.*;
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums,int k){ Map<Integer,Integer> f=new HashMap<>(); for(int x:nums)f.put(x,f.getOrDefault(x,0)+1); PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->Integer.compare(f.get(a),f.get(b))); for(int x:f.keySet()){q.offer(x);if(q.size()>k)q.poll();} int[] r=new int[k]; for(int i=k-1;i>=0;i--)r[i]=q.poll(); return r; }
}
