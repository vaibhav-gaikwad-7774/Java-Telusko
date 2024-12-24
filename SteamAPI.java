import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SteamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, 3, 4, 5);

        // Consumer<Integer> con = n -> System.out.println(n);

        Stream<Integer> s1 = nums.stream();

        s1.forEach(n -> System.out.println(n));

        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(i);
        // }

        // for (int n : nums) {
        // System.out.println(n);
        // }

        // nums.forEach(n -> System.out.println(n));

        // int sum = 0;
        // for (int n : nums) {

        // if (n % 2 == 0) {
        // n = n * 2;
        // sum = sum + n;
        // }
        // }

        // System.out.println(sum);
    }

}
