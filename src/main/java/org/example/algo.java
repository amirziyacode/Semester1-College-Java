package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class algo {
    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("book.txt");
            fileOutputStream.write(("Apple" + " : " + "Sibe").getBytes(StandardCharsets.UTF_8));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}