package DSA;

import java.util.Arrays;

public class PriorityQueue {
    private int count;
    private final int[] array;

    public PriorityQueue(int size) {
        array = new int[size];
    }

    public void add(int element) {
        int i ;
        i = ShiftingElement(element);
        array[i+1] = element;
        count++;
    }

    private int ShiftingElement(int element) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (array[i] > element) {
                array[i +1] = array[i];
            }else break;
        }
        return i;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
