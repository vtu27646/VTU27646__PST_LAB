/* Week 1 Session 5 | LeetCode: Squares of a Sorted Array */
import java.util.*;
public class SquaresOfASortedArray { public int[] sortedSquares(int[]a){int n=a.length,l=0,r=n-1,k=n-1;int[]b=new int[n];while(l<=r){if(Math.abs(a[l])>Math.abs(a[r]))b[k--]=a[l]*a[l++];else b[k--]=a[r]*a[r--];}return b;}public static void main(String[]x){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(Arrays.toString(new SquaresOfASortedArray().sortedSquares(a)));}}
