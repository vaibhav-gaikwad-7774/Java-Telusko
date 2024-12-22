class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }

}
