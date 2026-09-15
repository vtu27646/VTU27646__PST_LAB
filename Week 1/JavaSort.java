// Problem: Java Sort (HackerRank)
// Solution: Sort by CGPA descending, name ascending, then ID ascending.
import java.util.*;
class JavaSort {
    static class Student { int id; String name; double cgpa; Student(int i,String n,double c){id=i;name=n;cgpa=c;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); List<Student> a=new ArrayList<>();
        for(int i=0;i<n;i++) a.add(new Student(sc.nextInt(),sc.next(),sc.nextDouble()));
        a.sort((x,y)->{ int c=Double.compare(y.cgpa,x.cgpa); if(c!=0)return c; c=x.name.compareTo(y.name); return c!=0?c:Integer.compare(x.id,y.id); });
        for(Student s:a) System.out.println(s.name);
    }
}
