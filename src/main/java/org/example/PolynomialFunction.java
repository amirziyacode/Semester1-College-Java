package org.example;

public class PolynomialFunction {
    public static void main(String[] args) {
        printPolynomial(4);
    }

    private static void printPolynomial(int n) {
        StringBuilder px = new StringBuilder();
        for (int i = n+1; i > 0; i--) {
            px.append("A").append(i).append("x").append("^").append(i).append("+");
        }
        System.out.println(px);
    }
}
