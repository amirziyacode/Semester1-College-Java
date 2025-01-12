package org.example;

import java.util.Scanner;

public class MathProblem {
    // sin(x) = x - x3/3! - x5/5! - ...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree : ");
        int dg = sc.nextInt();

        Scanner len = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int length = len.nextInt();
        SinX(dg,length);
    }

    private static void SinX(int degree,int length){
        float radian = (float) (degree*3.14)/180;
        float resultOfSin = 0;
        for (int i = 1; i <length ; i++) {
            resultOfSin -= (float) (Math.pow(radian,i))/factorial(i);
        }
        System.out.println(Math.sin(resultOfSin) * Math.pow(10,4));
    }

    private static int factorial(int n) {
        return TrigeminalPascale.factorial(n);
    }
}
