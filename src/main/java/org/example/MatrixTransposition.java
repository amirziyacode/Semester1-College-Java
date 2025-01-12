package org.example;
import java.util.*;
public class MatrixTransposition {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Enter Number for " + i +"th");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int[][] transposed = new int[3][3];
        for (int i=0; i < transposed.length; i++) {
            for (int j=0; j < transposed[i].length; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        for (int[] mat:transposed){
            for(int num : mat){
                System.out.print(num + " ");
            }
        }
    }
}
