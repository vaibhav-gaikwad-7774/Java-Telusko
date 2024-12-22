import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(2);
        nums.add(1);
        nums.add(6);

        // System.out.println(nums.get(2));

        for (int n : nums) {
            // int num = (Integer) n;
            System.out.println(n);
        }

        // System.out.println(nums);

    }

}
