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

        Comparator <Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i%10 > j%10) {
                    return 1;
                }
                else {
                    return -1;
                }

            }
        };


        List<Student> nums =  new ArrayList<>();
        nums.add(new Student(21, "Vaibhav"));
        nums.add(new Student(23, "ankur"));
        nums.add(new Student(54, "gita"));
        nums.add(new Student(77, "pradnya"));
        nums.add(new Student(88, "sakshi"));

        Collections.sort(nums, com);
        System.out.println(nums);


        
    }
    
}
