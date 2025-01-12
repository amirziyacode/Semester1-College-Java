package org.example;

public class ConvertHEX {
    public static void main(String[] args) {
        NumberToHex(254);
        System.out.println(hexToDecimal("FE"));
    }

    private static void NumberToHex(int number) {
        StringBuilder result = new StringBuilder();
        String[] hexDigit = new String[]{"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        while (number >0){
            int reminder = number % 16;
           result.insert(0,hexDigit[reminder]);
            number = number / 16;
        }
        System.out.println(result);
    }

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int base = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char hexChar = hex.charAt(i);

            int value;
            if (hexChar >= '0' && hexChar <= '9') {
                value = hexChar - '0';
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                value = hexChar - 'A' + 10;
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                value = hexChar - 'a' + 10;
            } else {
                throw new IllegalArgumentException("Invalid !! " + hex);
            }

            decimal += value * base;

            base *= 16;
        }

        return decimal;
    }
}
