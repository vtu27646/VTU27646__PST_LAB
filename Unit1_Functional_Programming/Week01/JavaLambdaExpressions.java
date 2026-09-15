/*
 * Week 1 - Session 1
 * Problem: Java Lambda Expressions (HackerRank)
 * Link: https://www.hackerrank.com/challenges/java-lambda-expressions/problem
 * Solution: Lambda expressions implement odd/even, prime/composite and palindrome checks.
 */
import java.util.*;
import java.util.function.IntPredicate;

public class JavaLambdaExpressions {
    static IntPredicate isOdd = n -> n % 2 != 0;
    static IntPredicate isPrime = n -> {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    };
    static IntPredicate isPalindrome = n -> {
        int x = n, rev = 0;
        while (x > 0) { rev = rev * 10 + x % 10; x /= 10; }
        return rev == n;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int op = sc.nextInt(), n = sc.nextInt();
            boolean result = switch (op) {
                case 1 -> isOdd.test(n);
                case 2 -> isPrime.test(n);
                case 3 -> isPalindrome.test(n);
                default -> false;
            };
            if (op == 1) System.out.println(result ? "ODD" : "EVEN");
            else if (op == 2) System.out.println(result ? "PRIME" : "COMPOSITE");
            else if (op == 3) System.out.println(result ? "PALINDROME" : "NOT PALINDROME");
        }
    }
}
