package DSA;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 5, 6 };
        int target = 5;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);

        if (result1 != -1) {
            System.out.println("Element found at index : " + result1);
        } else {
            System.out.println("Element is not found");
        }

        if (result2 != -1) {
            System.out.println("Element found at index : " + result2);
        } else {
            System.out.println("Element is not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
