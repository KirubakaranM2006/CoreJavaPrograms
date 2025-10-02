package collection_Set_Types;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Iterator<String> it = fruits.iterator();  // get iterator

        System.out.println("Fruits using Iterator:");
        while (it.hasNext()) {//will see has has element if not it will stops
            String fruit = it.next();//will points to next element in set
            System.out.println(fruit);
        }
    }
}
//Explanation:
/*
Checks if the iterator still has more elements left to visit.

If yes → returns true → loop continues.

If no → returns false → loop stops.

Internally, the Iterator has a pointer/index (like a cursor) that starts at the beginning and keeps track of position.

Step 2: it.next()
Returns the next element in the set.

Moves the pointer forward to the next element for the next call.

If called after all elements are exhausted → throws NoSuchElementException.

Step 3: Store and Print

String fruit = it.next();        // Get the next fruit
System.out.println(fruit);       // Print it

Each iteration prints one fruit and moves the pointer forward to the next.///
*/
