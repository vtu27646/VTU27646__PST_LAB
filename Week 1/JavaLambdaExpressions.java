// Problem: Java Lambda Expressions (HackerRank)
// Solution: Use a functional interface to implement odd/even, prime/composite,
// and palindrome checks selected by the operation number.
import java.util.*;

class JavaLambdaExpressions {
    interface PerformOperation { boolean check(int a); }

    static boolean isOdd(int n) { return n % 2 != 0; }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
    static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int op = sc.nextInt();
            int n = sc.nextInt();
            PerformOperation p;
            if (op == 1) p = JavaLambdaExpressions::isOdd;
            else if (op == 2) p = JavaLambdaExpressions::isPrime;
            else p = JavaLambdaExpressions::isPalindrome;
            System.out.println(p.check(n) ? "ODD" : "EVEN");
            if (op == 2) System.out.println(p.check(n) ? "PRIME" : "COMPOSITE");
            if (op == 3) System.out.println(p.check(n) ? "PALINDROME" : "NOT PALINDROME");
        }
    }
}
