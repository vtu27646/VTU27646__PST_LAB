// Problem: Java Priority Queue (HackerRank)
// Solution: Use a priority queue ordered by CGPA descending, name ascending, ID ascending.
import java.util.*;
class JavaPriorityQueue {
    static class Student { int id; String name; double cgpa; Student(int i,String n,double c){id=i;name=n;cgpa=c;} }
    static class Priorities {
        List<Student> getStudents(List<String> events){
            Comparator<Student> cmp=(a,b)->{int c=Double.compare(b.cgpa,a.cgpa);if(c!=0)return c;c=a.name.compareTo(b.name);return c!=0?c:Integer.compare(a.id,b.id);};
            PriorityQueue<Student> q=new PriorityQueue<>(cmp);
            for(String e:events){String[] p=e.split(" ");if(p[0].equals("SERVED")){if(!q.isEmpty())q.poll();}else q.offer(new Student(Integer.parseInt(p[3]),p[1],Double.parseDouble(p[2])));}
            List<Student> result=new ArrayList<>(); while(!q.isEmpty()) result.add(q.poll()); return result;
        }
    }
}
