package arraylist;
import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        // Step 1: Declare ArrayList with wrapper class
        ArrayList<Integer> numbers = new ArrayList<>();

        // Step 2: Add elements (autoboxing)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);

        // Step 3: Retrieve with auto-unboxing
        int first = numbers.get(0);
        System.out.println("First number: " + first);  // Output: 10

        // Step 4: Update element
        numbers.set(1, 25);  // Now list is [10, 25, 30]

        // Step 5: Remove element
        numbers.remove(2);  // Now list is [10, 25]

        // Step 6: Loop through
        System.out.println("Final List:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }
    }
}
