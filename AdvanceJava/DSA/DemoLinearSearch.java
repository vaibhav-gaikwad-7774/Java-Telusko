package DSA;

import java.util.Scanner;

public class DemoLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Define an array of integers
        int[] nums = new int[n];

        System.out.println("Enter a Array element which is you want to:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        // Call the linear search method
        int result = linearSearch(nums, target);

        // Print the result
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }

    // Linear Search method
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }
}
