import java.util.*
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!11111");
    }
    
    public static void exercise1() {
        //swap 2 element of a list: swap elements at index 0 vs 3
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(10);
        lst.add(12);
        lst.add(99);
        lst.add(5);
        //
        //expected result: [99, 10, 12, 1, 5]
        
    }
    
    public static void exercise2() {
        //Update the code so that line 34 print 4 to console (do not change anything in the line 23->34)
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        Student s3 = new Student(3, "A");
        Student s4 = new Student(1, "A");
        Student s5 = new Student(4, "D");
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        System.out.println(students.size());
        
    }
    
    public static void exercise3() {
        //loop lst, print element to console and if the element is odd number -> remove the element
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(10);
        lst.add(12);
        lst.add(99);
        lst.add(5);
        lst.add(8);
        lst.add(51);
        lst.add(100);
        //code from here
        
    }
}
class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
