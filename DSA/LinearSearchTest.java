package DSA;

public class LinearSearchTest {
    public static void main(String[] args) {
        int A[] = { 1, 3, 4, 5, 6 };
        int Target = A[4];
        int n = A.length;

        int result = -1;
        for (int i = 0; i < n; i++) {
            result = i;
            break;
        }
        if (result != -1) {
            System.out.println("Element is not Found" + result);

        } else {
            System.out.println("Element is found");
        }
    }
}
