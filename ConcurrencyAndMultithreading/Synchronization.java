package ConcurrencyAndMultithreading;

class SharedResource {
    private final Object lock = new Object(); // Common lock object

    public void methodOne() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " Entered methodOne ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + " exiting mehodOne");
        }
    }

    public void methodTwo() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " entered methodTwo");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName() + " exiting methodTwo");
        }
    }
}

// Both methodOne() and methodTwo() use the same lock object (lock).
// Even though the two methods are different, the synchronized (lock) block ensures:
// Only one thread at a time can hold the lock and execute either method.
// So if Thread-1 is in methodOne(), Thread-2 will have to wait before entering methodTwo().
 
public class Synchronization {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> resource.methodOne(), "Thread-1");
        Thread t2 = new Thread(() -> resource.methodTwo(), "Thread-2");

        t1.start();
        t2.start();
    }
}
