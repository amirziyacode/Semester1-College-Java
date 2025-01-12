package org.example;



public class PrimNumber {

    public static void main(String[] args) {
        System.out.println(isPrimNumber(13));
    }

    private static boolean isPrimNumber(int n) {
        if(n < 2) return false;
        int i = 2;

        while(i<=Math.sqrt(n)) {
            if(n%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
