// Set is a data structure that stores unique elements.
// Time complexity of HashSet is O(1) for adding and removing elements.
package set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Adding elements to the set
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4); // Doesn't allow duplicate elements
        System.out.println(set);

        // Remove element from the set
        set.remove(3);
        System.out.println(set);

        // Check if element is present in the set
        boolean isPresent = set.contains(2);
        System.out.println(isPresent);

        // Check if set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println(isEmpty);

        // Get the size of the set
        // set.size() returns the size of the set
        System.out.println(set.size());

        // Clear all elements in the set
        // set.clear() removes all elements from the set
        
        set.clear();
        System.out.println(set);
    }
}
