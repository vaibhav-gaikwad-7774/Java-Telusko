class A {
    public void show() throws ClassNotFoundException {

        Class.forName("Calc");
    }

}

public class throwsKey {
    static {
        System.out.println("class Loaded");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }

    }

}
