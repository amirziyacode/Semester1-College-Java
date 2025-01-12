package org.example;

public class GenerateNumbers {
    public static void main(String[] args) {
        GenerateNumbers3();
    }
    private static void GenerateNumbers3() {
        int[] numbers = {1,2,3,4};
        for (int i : numbers) {
            for(int j : numbers){
                for(int k : numbers){
                    System.out.println("" + i +  j  + k);
                }
            }
        }
    }
}
