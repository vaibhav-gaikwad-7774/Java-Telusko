
class vaibhavException extends Exception {
    public vaibhavException(String string) {
        super(string);

    }
}

public class throwKey {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new vaibhavException("i dont want to print 0");
        }

        catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("Thats the default value" + e);

        }

        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");

    }

}
