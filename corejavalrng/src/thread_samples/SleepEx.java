package thread_samples;

//File: UsingMainthrd.java


class Firstthread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Running thread - Count: " + i);
         try {
             Thread.sleep(1000); // Slow down t1
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}

public class SleepEx {
 public static void main(String[] args) {
     Firstthread t1 = new Firstthread();
     t1.start(); // t1 will run slowly (1 second each)

     try {
         t1.join(); // Main thread waits until t1 finishes
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     // Now main thread starts
     for (int i = 1; i <= 5; i++) {
         System.out.println("Main thread - Count: " + i);
         try {
             Thread.sleep(1000); // Slow print
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }
}
