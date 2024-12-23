import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Sorting {
    public static void main(String[] args) {

        // Comparator to sort Students by age
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return Integer.compare(i.age, j.age); // Simplified comparison
            }
        };

        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Vaibhav"));
        students.add(new Student(23, "Ankur"));
        students.add(new Student(54, "Gita"));
        students.add(new Student(77, "Pradnya"));
        students.add(new Student(88, "Sakshi"));

        // Sorting using custom comparator
        Collections.sort(students, com);

        // Printing the sorted list
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
