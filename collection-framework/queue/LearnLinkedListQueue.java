// LinkedList is a data structure that store element in FIFO (First In First Out) principle.
package queue;
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
       Queue<Integer> queue = new LinkedList<>();

       // Adding elements to the queue
       queue.offer(1);
       queue.offer(2);
       queue.offer(3);
       System.out.println(queue);

       // Remove and returns the front element
       System.out.println(queue.poll());
       System.out.println(queue);

       // Check for front element
       // peek() method returns the front element of the queue
       System.out.println(queue.peek());
    }
}
