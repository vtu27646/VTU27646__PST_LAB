/* Week 1 Session 4 | LeetCode: Running Sum of 1D Array */
import java.util.*;
public class RunningSumOf1DArray { public int[] runningSum(int[] a){for(int i=1;i<a.length;i++)a[i]+=a[i-1];return a;} public static void main(String[]x){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();System.out.println(Arrays.toString(new RunningSumOf1DArray().runningSum(a)));}}
