package org.example;
import  java.util.*;
public class TrigeminalPascale {

    public static void main(String[] args) {

        System.out.println("Enter Height of Triangle ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for(int i = 0; i < height; i++){
            for (int space = 0; space <height -i; space++) {
                System.out.print("");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(pascalValue(i,j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    // n! / r! * (n-r)! =>  c(n,r)
    public static int pascalValue(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int result =1;
        for (int j = 2; j <= n; j++) {
            result *= j;
        }
        return result;
    }
}
