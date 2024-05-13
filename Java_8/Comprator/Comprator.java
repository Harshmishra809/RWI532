import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comprator {
    public static void main(String[] args) {
        Student s1 = new Student(21, "Harsh");
        Student s2 = new Student(32, "Sahil");
        Student s3 = new Student(33, "Jatin");
        List<Student> li = new ArrayList<Student>();
          li.add(s1);
        li.add(s2);
    li.add(s3);
         Collections.sort(li, (a, b) -> b.id - a.id);
        System.out.println(li);
    }
}

class Student {
    public Integer id;
     public String name;

    public Student(Integer id, String name) {
          this.id = id;
        this.name = name;
    }

    public String toString() {
                return this.id + ": " + this.name;
    }

    public static void forEach(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forEach'");
    }

    public static void forEach(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forEach'");
    }
}
