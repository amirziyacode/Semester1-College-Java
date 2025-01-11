package DSA;
import java.util.Arrays;

public class StackBuild {

     private final int[] array; //  []
    private int count;
    public StackBuild(int length) {
         array = new int[length];
    }
    public void push(int value) {
        if (count == array.length) throw new StackOverflowError();
        array[count++] = value;
    }
    public void pop(){
        if (count == 0) throw new IllegalStateException();
        --count;
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException();
        return array[count-1];
    }
    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString() {
       var updateList =  Arrays.copyOfRange(array, 0, count);
        return Arrays.toString(updateList);
    }
}
