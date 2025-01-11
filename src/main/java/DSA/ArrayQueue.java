package DSA;


import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private int[] array;
    private int count;
    private int front;



    public ArrayQueue(int len) {
        array = new int[len];
    }

    public void enqueue(int x) {
        array[count++] = x;
    }

    public void dequeue() {
        if(count == 0) throw new IllegalStateException("Queue is empty");
        array[front++] = 0;
        count--;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public boolean isFull() {
        return array.length == count;
    }


    @Override
    public String toString() { //front = 1
        int last = count -1;
        int index = front;
        int next =0;
        int[] newArr  = new int[count - front];
        while (index <=last) {
             newArr[next] = array[index];
             next++;
             index++;
        }
        return Arrays.toString(newArr);
    }
}
