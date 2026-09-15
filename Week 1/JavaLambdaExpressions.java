// Problem: Java Lambda Expressions (HackerRank)
// Solution: Select a lambda operation through a functional interface.
import java.util.*;
class JavaLambdaExpressions {
    interface PerformOperation { boolean check(int a); }
    static boolean odd(int n){ return n % 2 != 0; }
    static boolean prime(int n){ if(n < 2) return false; for(int i=2;i*i<=n;i++) if(n%i==0) return false; return true; }
    static boolean palindrome(int n){ String s=String.valueOf(n); return s.equals(new StringBuilder(s).reverse().toString()); }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int t=sc.nextInt();
        while(t-->0){ int op=sc.nextInt(), n=sc.nextInt(); PerformOperation p;
            if(op==1){ p=JavaLambdaExpressions::odd; System.out.println(p.check(n)?"ODD":"EVEN"); }
            else if(op==2){ p=JavaLambdaExpressions::prime; System.out.println(p.check(n)?"PRIME":"COMPOSITE"); }
            else { p=JavaLambdaExpressions::palindrome; System.out.println(p.check(n)?"PALINDROME":"NOT PALINDROME"); }
        }
    }
}
