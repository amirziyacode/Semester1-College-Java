package DSA;
import java.util.Arrays;
import java.util.Stack;

public class StackQueue {

    private  Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> reversedStack = new Stack<>(); // [30,20,10]

    public void enqueue(int value) {
        stack.push(value);
    }

    public void dequeue() {
        if(stack.isEmpty() && reversedStack.isEmpty()) throw new IllegalStateException();
        if (reversedStack.isEmpty()) {
            while (!stack.isEmpty() ) {
                reversedStack.push(stack.pop());
            }
        }
        stack = reversedStack;

        stack.pop();
    }


    @Override
    public String toString() {
        return Arrays.toString(stack.toArray());
    }
}
