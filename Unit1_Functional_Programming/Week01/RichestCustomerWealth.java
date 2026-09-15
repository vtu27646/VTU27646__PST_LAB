/* Week 1 Session 4 | LeetCode: Richest Customer Wealth */
import java.util.*;
public class RichestCustomerWealth { public int maximumWealth(int[][] a){int m=0;for(int[]r:a){int s=0;for(int x:r)s+=x;m=Math.max(m,s);}return m;} public static void main(String[]x){Scanner s=new Scanner(System.in);int m=s.nextInt(),n=s.nextInt();int[][]a=new int[m][n];for(int i=0;i<m;i++)for(int j=0;j<n;j++)a[i][j]=s.nextInt();System.out.println(new RichestCustomerWealth().maximumWealth(a));}}
