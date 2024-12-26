package list;
import java.util.LinkedList;
import java.util.List;
public class LearnLinkedList {
    public static void main(String[] args) {
      List<Integer> linkedList = new LinkedList<>();  

        // Adding elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList);

        // Get element at specific index
        System.out.println(linkedList.get(0));

        // Add element at specific index
        linkedList.add(2, 5);
        System.out.println(linkedList);

        // Remove element at specific index
        linkedList.remove(2);
        System.out.println(linkedList);

    }
}