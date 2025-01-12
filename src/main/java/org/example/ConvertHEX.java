package org.example;

public class ConvertHEX {
    public static void main(String[] args) {
//        NumberToHex(10);
    }

    private static void NumberToHex(int number) {
        StringBuilder result = new StringBuilder();
        String[] hexDigit = new String[]{"0","1","2","3","4","5","6","7","8","0","A","B","C","D","E","F"};
        while (number >0){
            int reminder = number % 16;
           result.append(hexDigit[reminder]);
            number = number / 16;
        }
        System.out.println(result);
    }
}
