package JavaMain;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// import com.apple.eawt.event.FullScreenEvent;

public class SteamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 3, 4, 5);

        // Create a new stream for each operation
        // Stream<Integer> s1 = nums.stream();
        // // s1.forEach(n -> System.out.println("Stream s1: " + n));

        // // Create a new stream for filtering
        // Stream<Integer> s2 = nums.stream().filter(n -> n % 2 == 0);
        // // s2.forEach(n -> System.out.println("Filtered Stream s2: " + n));

        // Stream<Integer> s3 = s2.map(n -> n * 2);

        // int result = s3.reduce(0, (c, e) -> c + e);

        // Predicate<Integer> p = n -> n % 2 == 0; // filter function

        // Function<Integer, Integer> fun = new Function<Integer, Integer>() {
        // public Integer apply(Integer n) {
        // return n * 2;
        // }

        // };

        // Function<Integer, Integer> fun = n -> n * 2;

        int result = nums.stream()
                // .filter(p)
                .map(n -> n * 2) // that whic we already defined and declared
                .reduce(0, (c, e) -> c + e);

        System.out.println(result);

        // s3.forEach(n -> System.out.println(n));

        // List<Integer> nums = Arrays.asList(2, 3, 4, 5);

        // // Consumer<Integer> con = n -> System.out.println(n);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);

        // s1.forEach(n -> System.out.println(n));

        // s1.forEach(n -> System.out.println(n));

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
