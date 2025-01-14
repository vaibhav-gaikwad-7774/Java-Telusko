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
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps Taken by Linear: " + steps);
                return i;
            }
        }
        System.out.println("Steps Taken by Linear: " + steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps Taken by binary: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps Taken by Linear: " + steps);
        return -1;
    }
}
