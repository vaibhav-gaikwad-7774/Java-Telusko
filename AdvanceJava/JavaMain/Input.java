package JavaMain;

import java.io.IOException;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the Number");

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();

        System.out.println(a1);

        // // int num = System.in.read();

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        sc.close();

    }
}
