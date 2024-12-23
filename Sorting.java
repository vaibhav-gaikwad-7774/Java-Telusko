import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> nums =  new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(8);
        nums.add(1);
        nums.add(7);

        Collections.sort(nums);
        System.out.println(nums);


        
    }
    
}
