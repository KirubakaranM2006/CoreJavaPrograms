//program using single thread and main program thread
package thread_samples;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread - Count: " + i);
        }
    }
}

public class UsingMainthrd {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create a thread
        t1.start();
        try {
			t1.sleep(4200);//t1.sleep(4000) actually pauses the main thread, NOT the t1 thread.
		} catch (InterruptedException e){// {Because sleep() is a static method in the Thread class.
			e.printStackTrace();
		}// Start the thread

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread - Count: " + i);
            try {
				Thread.sleep(4200);//should use-> thread.sleep in main thread
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
//o/p may differ it not be same at all time
//This program runs two threads:

//t1 (your custom thread)

//main (the main program thread)