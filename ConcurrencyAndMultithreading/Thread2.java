package ConcurrencyAndMultithreading;

public class Thread2 implements Runnable{

//  When implementing Runnable interface you have to override the "run()"      

    @Override
    public void run() {
        for (int i = 0; i < 5; i ++){
            System.out.println(Thread.currentThread() + ", " + i);
        }
    
    }
    
}