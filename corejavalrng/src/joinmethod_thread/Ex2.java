package joinmethod_thread;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(" Child Thread: " + i);
        }
    }
}

public class Ex2 {
    public static void main(String[] args) {
        System.out.println(" Main thread started");

        MyThread t1 = new MyThread();   // Step 1
        t1.start();                     // Step 2 - Child thread runs

        try {
            System.out.println(" Main thread waiting for child thread to finish...");
            t1.join();                  // Step 3 - Main waits here
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(" Main thread continues after child thread is done");
        System.out.println(" Main thread finished");
    }
}
