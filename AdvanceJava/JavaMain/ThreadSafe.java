package JavaMain;
class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = () -> { // applying lambda function which is used
            for (int i = 1; i <= 1000; i++) {

                c.increment();
            }
        };

        Runnable obj2 = () -> { // applying lambda function which is used
            for (int i = 1; i <= 1000; i++) {

                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }

}
