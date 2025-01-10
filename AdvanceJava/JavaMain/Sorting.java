package JavaMain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
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

    // Implementing the compareTo method for comparing by age
    @Override
    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else if (this.age < that.age) {
            return -1;
        } else {
            return 0; // This handles the case when both students have the same age
        }
    }
}

public class Sorting {
    public static void main(String[] args) {

        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(21, "Vaibhav"));
        students.add(new Student(23, "Ankur"));
        students.add(new Student(54, "Gita"));
        students.add(new Student(77, "Pradnya"));
        students.add(new Student(88, "Sakshi"));

        // Sorting using the compareTo method implemented in the Student class
        Collections.sort(students);

        // Printing the sorted list
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
