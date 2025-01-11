package org.example;

import java.util.Scanner;

public class Quadraticequation {

    public static void main(String[] args) {
        // ax2 + bx + c = 0
        int a,b,c;
        System.out.println("Enter Dagre of A :");
        Scanner inputA = new Scanner(System.in);
        a = inputA.nextInt();
        System.out.println("Enter Dagre of B :");
        Scanner inputB = new Scanner(System.in);
        b = inputB.nextInt();
        System.out.println("Enter Dagre of C :");
        Scanner inputC = new Scanner(System.in);
        c = inputC.nextInt();
        // formulae  (b(+-)(b**2 - 4ac)**0.5))/2a
        float delta = (float) (Math.pow(b,2) - 4*a*c);

        if(delta > 0) {
            float x1 =(float) (b  + (Math.sqrt(delta)))/2*a;
            float x2 =(float) (b  - (Math.sqrt(delta)))/2*a;
            System.out.print("x1 : "+x1 + "  " + "x2 :" + x2);
            return;
        }
        if(delta == 0) {
            float x = (float) -b / (2*a);
            System.out.println("X: "+ x  );
            return;
        }
        else {
            System.out.println("We Can't Find It !");
        }
    }
}
