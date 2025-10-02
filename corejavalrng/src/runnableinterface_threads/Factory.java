package runnableinterface_threads;

// Task 1
class PackingTask implements Runnable {
    public void run() {
        System.out.println("Packing boxes...");
    }
}

// Task 2
class LabelTask implements Runnable {
    public void run() {
        System.out.println("Printing labels...");
    }
}

// Main class with main() method
public class Factory {
    public static void main(String[] args) {

        // Step 1: Create the task objects
        PackingTask packing = new PackingTask();
        LabelTask labeling = new LabelTask();

        // Step 2: Create threads with the tasks
        Thread workerA = new Thread(packing);
        Thread workerB = new Thread(labeling);

        // Step 3: Start the threads
        workerA.start();
        workerB.start();
    }
}
