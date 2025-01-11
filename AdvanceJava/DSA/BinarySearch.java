package DSA;

public class BinarySearch {
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
        int[] A = { 10, 20, 30, 40, 50 }; // Sorted array
        int Target = 30;

        int result = binarySearch(A, Target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
