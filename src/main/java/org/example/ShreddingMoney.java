package org.example;

import java.util.*;
public class ShreddingMoney {
    public static void main(String[] args) {
        System.out.println("Enter Your Money : ");
        Scanner inputMoney = new Scanner(System.in);
        int ownerMoney = inputMoney.nextInt();
        Map<String,Integer> tableOfMoney = new HashMap<>();
        tableOfMoney.put("50000",0);
        tableOfMoney.put("10000",0);
        tableOfMoney.put("5000",0);
        tableOfMoney.put("1000",0);
        int i,j,k,f;
        i=0;
        j=0;
        k=0;
        f=0;

        while (ownerMoney != 0) {
            if(ownerMoney >= 50000) {
                ownerMoney -= 50000;
                i++;
                tableOfMoney.put("50000",i);
            }
            if(ownerMoney < 50000 && ownerMoney>=10000) {
                ownerMoney -= 10000;
                j++;
                tableOfMoney.put("10000",j);
            }
            if(ownerMoney < 10000 && ownerMoney>=5000) {
                ownerMoney -= 5000;
                k++;
                tableOfMoney.put("5000",k);
            }
            if(ownerMoney < 5000 && ownerMoney>=1000) {
                ownerMoney -= 1000;
                f++;
                tableOfMoney.put("1000",f);
            }

        }

        System.out.println(tableOfMoney);
    }
}
