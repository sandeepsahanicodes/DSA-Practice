// ArrayList is similar to array but it is dynamic in size.
// Drawback of array is that it is fixed in size. To overcome this, we use ArrayList.
// Time complexity of ArrayList is O(n) for adding and removing elements.
package list;
import java.util.ArrayList;
import java.util.Iterator;
public class LearnArrayList {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
       
        // Adding elements to the list
        list.add("Sandeep Sahani");
        list.add("Roshan Sharma");
        list.add("Karan Kamal");
        list.add("Arjun Singh");
        System.out.println(list);

        // Adding element at specific index
        list.add(2, "Rahul Kumar");
        System.out.println(list);

        // Add all elements of another list
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Rahul Bhagat");
        list2.add("Rajesh Kumar");
        list.addAll(list2);
        System.out.println(list);

        // Getting element at specific index
        System.out.println(list.get(4));

        // Removing element at specific index
        list.remove(4);
        System.out.println(list);

        // Removing element by value
        list.remove("Rahul Bhagat");
        System.out.println(list);

        // Delete all elements in the list
        list.clear();
        System.out.println(list);

        // set element at specific index
        list.add("Sandeep Sahani");
        list.add("Roshan Sharma");
        list.add("Karan Kamal");
        list.set(1, "Ravi Raj");
        System.out.println(list);

        // Check if element is present in the list TC: O(n)
        boolean isPresent = list.contains("Roshan Sharma");
        System.out.println(isPresent);

        // Iterate over the list using for loop
        // list.size() returns the size of the list
        System.out.println("Iterate over the list using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The elements of list is: " + list.get(i));
        }

        // Iterate over the list using for-each loop
        System.out.println("Iterate over the list using for-each loop");
        for (String element : list) {
            System.out.println("The elements of list is: " + element);
        }

        // Iterate over the list using iterator
        // Iterator is an interface that is used to iterate over the elements of a collection.
        Iterator<String> iterator = list.iterator();

        // hasNext() returns true if the iteration has more elements.
        // next() returns the next element in the iteration.
        System.out.println("Iterate over the list using iterator");
        while (iterator.hasNext()) {
            System.out.println("The elements of list is: " + iterator.next());
        }
    }
}
