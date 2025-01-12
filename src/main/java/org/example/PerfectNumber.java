package org.example;

public class PerfectNumber {
    public static void main(String[] args) {
        generatePerfectNumber();
    }

    private static void generatePerfectNumber() {
        int i = 1000;
        while (i > 0) {
            isPerfectNumber(i);
            i--;
        }
    }
    private static void isPerfectNumber(int number){
        int sum = 0;
        if(number < 1){
            System.out.println(number);
        }
        for(int i = 1; i <= number /2; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println(number);
        }
    }
}
