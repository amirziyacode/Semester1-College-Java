package org.example;

import java.util.*;
public class MatricesSum {
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
        int[][] matSum = new int[2][2];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j <matA[i].length ; j++) {
                matSum[i][j] = matA[i][j] + matB[i][j];
            }
        }

        System.out.print("Result Of Sum : ");
        for (int[] ints : matSum) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
