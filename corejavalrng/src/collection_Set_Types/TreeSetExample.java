package collection_Set_Types;

import java.util.*;//by importing this we didnot seperately import set and TreeSet 

public class TreeSetExample {
    public static void main(String[] args) {

        // 1. Create a TreeSet
        Set<String> set = new TreeSet<>();
        System.out.println("1. Set created: " + set);

        // 2. Add Elements
        set.add("Pineapple");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate
        System.out.println("2. After adding elements: " + set);

        // 3. Remove Element
        set.remove("Banana");
        System.out.println("3. After removing 'Banana': " + set);

        // 4. Check if element exists
        boolean exists = set.contains("Apple");
        System.out.println("4. Does 'Apple' exist? " + exists);

        // 5. Size of the Set
        int size = set.size();
        System.out.println("5. Size of set: " + size);

        // 6. Iterate through Set
        System.out.println("6. Iterating over set:");
        for (String item : set) {
            System.out.println(" - " + item);
        }

        // 7. Clear the Set
        set.clear();
        System.out.println("7. After clearing set: " + set);

        // 8. Check if Set is empty
        boolean empty = set.isEmpty();
        System.out.println("8. Is set empty? " + empty);
    }
}
