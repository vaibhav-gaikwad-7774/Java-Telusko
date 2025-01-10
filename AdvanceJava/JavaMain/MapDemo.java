package JavaMain;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> Students = new HashMap<>();

        Students.put("navin", 34);
        Students.put("harsh", 22);
        Students.put("sushil", 33);
        Students.put("kiran", 44);
        Students.put("vaibhv", 55);

        System.out.println(Students);
    }

}
