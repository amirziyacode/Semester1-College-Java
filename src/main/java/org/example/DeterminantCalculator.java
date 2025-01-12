package org.example;

public class DeterminantCalculator {
    // Method to calculate the determinant of a matrix
    public static double calculateDeterminant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        double determinant = 0;
        for (int i = 0; i < n; i++) {
            determinant += Math.pow(-1, i) * matrix[0][i] * calculateDeterminant(getMinor(matrix, 0, i));
        }
        return determinant;
    }

    // Method to get the minor matrix after removing a row and a column
    private static double[][] getMinor(double[][] matrix, int row, int column) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int minorRow = 0, minorCol;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            minorCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == column) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }

    public static void main(String[] args) {
        // Example matrix
        double[][] matrix = {
                {4, 3, 2},
                {3, 2, 1},
                {2, 1, 1}
        };

        double determinant = calculateDeterminant(matrix);
        System.out.println("Determinant: " + determinant);
    }
}
