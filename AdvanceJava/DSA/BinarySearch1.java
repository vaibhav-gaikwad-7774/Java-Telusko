package DSA;

import java.util.Scanner;

public class BinarySearch1 {
    public static int binarySearch(int[] A, int Target) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (A[mid] == Target) {
                return mid; // Target found, return the index
            } else if (A[mid] < Target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a sorted array
        int[] A = { 10, 20, 30, 40, 50 };

        // Prompt the user to enter the target
        System.out.print("Enter the target number to search: ");
        int Target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(A, Target);

        // Display the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();
    }
}
