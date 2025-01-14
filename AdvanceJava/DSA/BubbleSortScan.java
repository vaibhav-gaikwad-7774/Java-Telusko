package DSA;

import java.util.Scanner;

public class BubbleSortScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Element which is you want to print : ");
        int size = sc.nextInt();

        int nums[] = new int[size];

        System.out.println("Enter the Element of the Array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }

        }

        System.out.println("\n After Sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();

    }

}
