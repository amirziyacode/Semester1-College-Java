package org.example;
import java.util.*;
public class Subscription {
    public static void main(String[] args) {
        int i,j;
        i =0;
        j=0;
        int[] a = new int[3];
        int[] b = new int[3];
        Set<Integer> c = new HashSet<>();
        Scanner inputListOfA = new Scanner(System.in);
        Scanner inputListOfB = new Scanner(System.in);
        while (i<a.length){
            System.out.println("Enter three numbers For A List :");
            a[i] = inputListOfA.nextInt();
            i++;
        }
        while (j<b.length){
            System.out.println("Enter three numbers For B List :");
            b[j] = inputListOfB.nextInt();
            j++;
        }
        for (int value : a) {
            for (int k : b) {
                if (value == k) {
                    c.add(value);
                }
            }
        }

        System.out.println(Arrays.toString(c.toArray()));

    }
}
