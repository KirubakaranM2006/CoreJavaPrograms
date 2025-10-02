package runnableinterface_threads;

class MyTask implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Running task: " + i);
        }
    }
}

public class Mainclass {
    public static void main(String[] args) {
        MyTask task = new MyTask();          // 1. Create the task
        Thread t = new Thread(task);         // 2. Give it to a thread
        t.start();                           // 3. Start the thread
    }
}
