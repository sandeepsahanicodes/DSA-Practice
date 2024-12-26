// Stack is a data structure that follows LIFO (Last In First Out) principle.
package list;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        // Adding elements to the stack
        stack.push("Sandeep Sahani");
        stack.push("Roshan Sharma");
        stack.push("Karan Kamal");
        System.out.println(stack);

        // Check for top element
        // peek() method returns the top element of the stack
        System.out.println(stack.peek());

        // Remove top element
        // pop() method removes the top element of the stack
        stack.pop();
        System.out.println(stack);
    }
}
