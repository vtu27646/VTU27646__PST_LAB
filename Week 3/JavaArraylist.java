// Problem: Java Arraylist (HackerRank)
// Solution: Read each variable-length list, then answer each indexed query safely.
import java.util.*;
class JavaArraylist {
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); List<List<Integer>> a=new ArrayList<>(); for(int i=0;i<n;i++){int d=sc.nextInt();List<Integer> row=new ArrayList<>();for(int j=0;j<d;j++)row.add(sc.nextInt());a.add(row);} int q=sc.nextInt(); while(q-->0){int x=sc.nextInt()-1,y=sc.nextInt()-1; if(x>=0&&x<a.size()&&y>=0&&y<a.get(x).size())System.out.println(a.get(x).get(y));else System.out.println("ERROR!");} }
}
