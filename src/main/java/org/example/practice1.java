package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;
// name : Amir Ali ziya zadeh
// group : 1
// part:2
public class practice1 {
    public static void main(String[] args) {
        int size = 5;
        String[] enWords = new String[size];
        enWords[0] = "book";
        enWords[1] = "black";
        enWords[2] = "pen";
        enWords[3] = "bicycle";
        enWords[4] = "car";
        String[] fnWords = new String[size];
        fnWords[0] = "ketab";
        fnWords[1] = "siah";
        fnWords[2] = "ghalam";
        fnWords[3] = "docharkhe";
        fnWords[4] = "mashin";

        while(true){
            System.out.println("Enter a Options: ");
            System.out.println("-Load");
            System.out.println("-Save");
            System.out.println("-New");
            System.out.println("-Find");
            System.out.println("-List");
            System.out.println("-Exit");
            Scanner commandIn = new Scanner(System.in);
            String command = commandIn.next();
            switch(command){
                case "find":
                    Scanner enWordsFind = new Scanner(System.in);
                    System.out.println("Enter the word: ");
                    String enFind = enWordsFind.next();
                    System.out.println("-------------------------------------------");
                    for (int i = 0; i <enWords.length ; i++) {
                        if(enWords[i].equals(enFind)){
                            System.out.println(fnWords[i]);
                        }
                    }
                    System.out.println("-------------------------------------------");
                    break;
                case "list":
                    System.out.println("-------------------------------------------");
                    for (int i = 0; i < enWords.length ; i++) {
                        System.out.println(enWords[i] + " : " + fnWords[i]);
                    }
                    System.out.println("-------------------------------------------");
                    break;
                case "load":
                    try( FileInputStream fileOutputStream = new FileInputStream("book.txt")) {
                        size++;
                        String[] stringEn = Arrays.copyOf(enWords,size);
                        String[] stringFn = Arrays.copyOf(fnWords,size);
                        int read;
                        StringBuilder worBuilder = new StringBuilder();
                        String enBuilder = "";
                        String fnBuilder = "";
                        while ((read = fileOutputStream.read())!= -1){
                                worBuilder.append((char) read);
                        }
                        for (int i = 0; i <worBuilder.length() ; i++) {
                            if(worBuilder.charAt(i) == ':'){
                                enBuilder = worBuilder.substring(0, i);
                                fnBuilder = worBuilder.substring(i+1, worBuilder.length()-1);
                            }
                        }
                        stringEn[stringEn.length -1] =enBuilder;
                        stringFn[stringFn.length -1] = fnBuilder;
                        enWords = stringEn;
                        fnWords = stringFn;
                        System.out.println("-------------------------------------------");
                        System.out.println("word is add from book.txt");
                        System.out.println("-------------------------------------------");
                    }catch (IOException e){
                        System.out.println("File not found");
                    }
                    break;
                case "save":
                    try (FileOutputStream fileOutputStream = new FileOutputStream("dictionary.txt")){
                        for (int i = 0; i < enWords.length; i++) {
                            fileOutputStream.write((enWords[i] + ":" + fnWords[i] + " ").getBytes(StandardCharsets.UTF_8));
                        }
                    }catch (IOException e){
                        System.out.println("None Words Find It !! ");
                    }
                    break;
                case "new":
                    size ++;
                    Scanner enWordsNew = new Scanner(System.in);
                    System.out.println("Enter English word: ");
                    String enNew = enWordsNew.next();
                    Scanner fnWordsNew = new Scanner(System.in);
                    System.out.println("Enter Farsi word: ");
                    String fnNew = fnWordsNew.next();

                    String[] stringEn = Arrays.copyOf(enWords,size);
                    String[] stringFn = Arrays.copyOf(fnWords,size);
                    stringEn[stringEn.length -1] =enNew;
                    stringFn[stringFn.length -1] = fnNew;
                    for (String enWord : enWords) {
                        if (enWord.equals(enNew)) {
                            System.out.println("OverWrite -> " + enNew);
                        }
                    }
                     enWords =stringEn ;
                     fnWords = stringFn;
                     break;
                case "exit":
                    return;
                default:
                    System.out.println("-------------------------------------------");
                    System.out.println("Invalid Option !!!");
                    System.out.println("-------------------------------------------");
                    break;
            }
        }
    }
}
