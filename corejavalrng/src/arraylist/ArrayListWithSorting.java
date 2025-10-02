//dont consider autoboxing and unboxing just assigning value to variable

package arraylist;

import java.util.ArrayList;//must for using arraylist
import java.util.Collections;//must for using coolection class for sorting functions

public class ArrayListWithSorting {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Step 2: Add elements (autoboxing happens here)
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        // Step 3: Print the original list
        System.out.println("Original List: " + numbers);

        // Step 4: Update an element
        numbers.set(1, 25);  // Replaces 10 with 25
        System.out.println("After update: " + numbers);

        // Step 5: Remove an element at index 0
        numbers.remove(0);  // Removes 30
        System.out.println("After removal: " + numbers);

        
        //dont consider autoboxing and unboxing just assigning value to variable
        // Step 6: Retrieve a value (auto-unboxing)
        int value = numbers.get(0);
        System.out.println("First value: " + value);

        // Step 7: Loop through the list
        System.out.println("Looping through the list:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Index " + i + ": " + numbers.get(i));
        }

        // Step 8: Sort the list in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}

  
//   Step	       Concept	                 Method Used
//--------------------------------------------------------------------
//   Add	       add()	                 Add elements to list
//   Update	       set(index, value)	     Replace value at index
//   Remove	       remove(index)	         Remove value
//   Access	       get(index)	             Retrieve with unboxing
//   Sort	       Collections.sort(list)	 Ascending order

