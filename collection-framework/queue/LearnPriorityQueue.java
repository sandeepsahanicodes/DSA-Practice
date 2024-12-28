
/* 
 Priority Queue is a special type of queue in which each element is associated 
with a priority and is served according to its priority.
 */

package queue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
     public static void main(String[] args) {
        // Default constructor of priority queue(Follows min heap)
        Queue<Integer> pqMinHeap = new PriorityQueue<>();
        
        // If we want to implement max heap, we can use below constructor
        Queue<Integer> pqMaxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements to the priority queue
        // it implements min heap by default. So the order will be from smallest to largest
        pqMinHeap.offer(3);
        pqMinHeap.offer(4);
        pqMinHeap.offer(6);
        pqMinHeap.offer(9);

        System.out.println(pqMinHeap);

        // remove and returns the front element
        // poll() method removes and returns the front element of the queue. 
        // The poll() returns the value with highest priority(i.e the lowest value).
        System.out.println(pqMinHeap.poll());
        System.out.println(pqMinHeap);

        // Returns the front element
        // peek() method returns the front element of the queue
        System.out.println(pqMinHeap.peek());
        
     }
}