package ConcurrencyAndMultithreading;

class MyThread extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName() + " is RUNNABLE (started)");

        try{
            // Simulating running state
            Thread.sleep(2000); // Thread moves to TIMED_WAITING STATE
            System.out.println(Thread.currentThread().getName() + " woke up and is RUNNING again");
        } catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " was INTERRUPTED");
        }

        System.out.println(Thread.currentThread().getName() + " is TERMINATED (completed)");
    }

}


public class ThreadLifeCycleDemo {
    
    public static void main(String[] args) throws InterruptedException{
        MyThread thread = new MyThread();

        System.out.println("Thread state before start(): " + thread.getState());
        thread.start(); // Thread moves to RUNNABLE

        // Wait a moment add checks state again
        Thread.sleep(500);
        System.out.println("Thread state after start(): " + thread.getState()); // RUNNABLE or TIMED_WAITING

        // Wait for thread to finish
        thread.join();  // main waits for thread to terminate

        System.out.println("Thread state after completion: " + thread.getState());  // TERMINATED
        
    }
}
