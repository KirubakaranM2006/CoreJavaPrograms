package threaddemo;

//using sleep and join if not understood see notes

//Using sleep and join

class FirstThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("FirstThread: " + i);
         try {
             Thread.sleep(500); // Wait 500ms
         } catch (InterruptedException e) {
             System.out.println("FirstThread Interrupted");
         }
     }
 }
}

class SecondThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("SecondThread: " + i);
         try {
             Thread.sleep(500); // Wait 500ms
         } catch (InterruptedException e) {
             System.out.println("SecondThread Interrupted");
         }
     }
 }
}

public class Sleepdemo {
 public static void main(String[] args) {
     FirstThread t1 = new FirstThread();
     SecondThread t2 = new SecondThread();

     t1.start(); // Start FirstThread

     try {
         t1.join(); // Wait for FirstThread to finish
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted");
     }

     t2.start(); // Start SecondThread after FirstThread finishes
 }
}
