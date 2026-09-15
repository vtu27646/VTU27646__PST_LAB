/* Week 1 - Session 2
 * Problem: Java Sort (HackerRank)
 * Link: https://www.hackerrank.com/challenges/java-sort/problem
 * Solution: sort by CGPA descending, first name ascending, ID ascending.
 */
import java.util.*;

public class JavaSort {
    static class Student {
        int id; String name; double cgpa;
        Student(int id, String name, double cgpa) { this.id=id; this.name=name; this.cgpa=cgpa; }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> a = new ArrayList<>();
        for (int i=0;i<n;i++) a.add(new Student(sc.nextInt(), sc.next(), sc.nextDouble()));
        a.sort(Comparator.comparingDouble((Student s)->s.cgpa).reversed()
                .thenComparing(s->s.name).thenComparingInt(s->s.id));
        for (Student s:a) System.out.println(s.name);
    }
}
