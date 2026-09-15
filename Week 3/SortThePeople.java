// Problem: Sort the People (LeetCode)
// Solution: Sort indices by height descending and use the same indices to output names.
import java.util.*;
class SortThePeople {
    public String[] sortPeople(String[] names,int[] heights){ Integer[] idx=new Integer[names.length];for(int i=0;i<idx.length;i++)idx[i]=i;Arrays.sort(idx,(a,b)->Integer.compare(heights[b],heights[a]));String[] r=new String[names.length];for(int i=0;i<idx.length;i++)r[i]=names[idx[i]];return r; }
}
