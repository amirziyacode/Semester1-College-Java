package org.example;
import java.util.*;
public class MutiyMat {
    public static void main(String[] args) {
        int[][] matA = new int[2][2];
        int[][] matB = new int[2][2];
        Scanner matAInput = new Scanner(System.in);
        Scanner matBInput = new Scanner(System.in);
        for (int i = 0; i < matA.length; i++) {
            System.out.println("Enter " + (i + 1) + "th matricesA:");
            for (int j = 0; j < matA[i].length; j++) {
                matA[i][j] = matAInput.nextInt();
            }
        }
        for(int i = 0; i < matB.length; i++) {
            System.out.println("Enter " + (i + 1) + "th matricesB:");
            for (int j = 0; j < matB[i].length; j++) {
                matB[i][j] = matBInput.nextInt();
            }
        }
        int[][] matMulti = new int[matA.length][matA[0].length];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matB[0].length; j++) {
                for (int k = 0; k <matA[0].length ; k++) {
                    matMulti[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        System.out.print("Result Of Multiplication: : ");
        for (int[] ints : matMulti) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
