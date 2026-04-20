package JavaConcepts.Lambdaconcepts;

public class ThreadsExample {
    public static void main(String[] args) {
        // 1. Create a Runnable using a lambda expression
        // () -> { ... } represents the run() method
        Runnable printNumbers = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " printing: " + i);
                try {
                    // Small delay to see the thread in action
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // 2. Create a Thread object and pass the Runnable to it
        Thread myThread = new Thread(printNumbers);
        myThread.setName("NumberThread");

        // 3. Start the thread
        System.out.println("Main thread starting the worker thread...");
        myThread.start();

        // The main thread continues to run independently
        System.out.println("Main thread is done!");
    }
}
