package org.example;

import java.util.Scanner;

public class CountFlotNumber {
    public static void main(String[] args) {
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Flot Number :  ");
        float number = sc.nextFloat();
        String numString = String.valueOf(number);
        for (int i = 0; i < numString.length(); i++) {
            if(numString.charAt(i) != '.'){
                result += numString.charAt(i) - '0';
            }
        }

        System.out.println(result);
    }
}
