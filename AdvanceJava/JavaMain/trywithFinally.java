package JavaMain;
import java.util.Scanner;

public class trywithFinally {
    public static void main(String[] args) {

        int num = 0;

        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter the Number which is you want to print: ");
            num = sc.nextInt();

            System.out.println(num);

        } finally

        {
            // sc.close();

        }

    }
}
