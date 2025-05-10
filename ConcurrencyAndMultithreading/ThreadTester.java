package ConcurrencyAndMultithreading; 

public class ThreadTester{

    public static void main(String[] args) {
        
//  Here there are 2 threads i.e. "Main thread" and "Thread1"
//  Main thread will be parent thread of Thread1 so its "Parent-Child relationship"

        System.out.println("Main is starting...");
        
        // Thread thread1 = new Thread1("thread1");  extended Thread class
        // thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2"); // the 2nd parameter is  thread name and its optional
        thread2.start();

        System.out.println("Main is exiting...");
//  Order is very much platform dependent so its not necessary that it'll print in order
//  If there is no user thread running after main thread then it is upto the mercy of the JVM to 
//  either run the Daemon thread or let the Daeon thread continue its job or it might have an option to 
//  it abrouptly. 

//  When user thread dies Daemon thread has no existence. 
        
    }
}