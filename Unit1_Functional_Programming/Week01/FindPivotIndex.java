/* Week 1 Session 5 | LeetCode: Find Pivot Index */
import java.util.*;
public class FindPivotIndex { public int pivotIndex(int[]a){int total=0,left=0;for(int x:a)total+=x;for(int i=0;i<a.length;i++){if(left==total-left-a[i])return i;left+=a[i];}return -1;}public static void main(String[]x){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(new FindPivotIndex().pivotIndex(a));}}
