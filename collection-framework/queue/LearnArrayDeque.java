// ArrayDeque(Double Ended Queue) is data structure that store element in FIFO (First In First Out) principle.
// Its special because the elements can be added and removed from both the ends.

package queue;
import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Adding elements to the queue
        arrayDeque.offer(1); // add element at the end
        arrayDeque.offerFirst(2); // add element at the front
        arrayDeque.offerLast(3); // add element at the end
        arrayDeque.offer(4); // add element at the end
        System.out.println(arrayDeque);

        // get the first element
        System.out.println(arrayDeque.peekFirst());
        // get the last element
        System.out.println(arrayDeque.peekLast());
        // remove and returns the front element
        System.out.println(arrayDeque.poll());
        // remove and returns the first element
        System.out.println(arrayDeque.pollFirst());
        // remove and returns the last element
        System.out.println(arrayDeque.pollLast());

    }
}
