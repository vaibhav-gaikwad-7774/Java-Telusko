package DSA;

public class DemoLinarSearch {
    public static void main(String[] args) {
        int nums[] = { 2, 4, 5, 6, 11, 8, 1 };
        int target = 11;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index" + result);
        } else {
            System.out.println("Element not found");
        }

    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;

    }

}