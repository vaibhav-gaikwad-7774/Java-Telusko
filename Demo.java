public class Demo {
    public static void main(String[] args) {

        int i = 4;
        int j = 0;

        try {

            j = 18 / i;

        } catch (Exception e) {
            System.out.println("its a system fault");
        }

        System.out.println(j);

        System.out.println("bye");

    }
}