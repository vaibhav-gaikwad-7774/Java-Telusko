package DSA;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5, 3, 8, 6, 2};

        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Insertion Sort
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i]; // Current element to be sorted
            int j = i - 1;

            // Shift elements of sorted portion to make space for key
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }

            // Insert key at its correct position
            nums[j + 1] = key;
        }

        System.out.println("\nAfter Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
