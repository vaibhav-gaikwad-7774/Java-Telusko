package DSA;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 2, 1, 4, 5, 3, 6, 7, 8, 9, 5, 44, 4, 5, 6, 7, };
        int size = nums.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }

        System.out.println();
        System.out.println("after Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}