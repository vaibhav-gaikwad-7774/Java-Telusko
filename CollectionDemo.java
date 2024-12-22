import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(2);
        nums.add(1);
        nums.add(6);

        Iterator<Integer> Values = nums.iterator();

        while (Values.hasNext()) {
            System.out.println(Values.next());
        }

        // System.out.println(nums.get(2));

        // for (int n : nums) {
        // // int num = (Integer) n;
        // System.out.println(n);
        // }

        // System.out.println(nums);

    }

}
