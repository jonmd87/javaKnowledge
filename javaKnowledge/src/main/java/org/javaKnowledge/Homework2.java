package org.javaKnowledge;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Homework2 {

    public static void main(String[] args) throws IOException {
        System.out.println(myStringBuilder(5, 'a', 'f'));
        System.out.println(myStringBuilder(6, 'a', 'f'));
        System.out.println(myStringBuilder(0, 'a', 'f'));
        System.out.println(myStringBuilder(-4, 'a', 'f'));

        writeInFile();
    }

    /**
     * Дано четное число N (>0) и символы c1 и c2.
     * Написать метод, который вернет строку длины N,
     * которая состоит из чередующихся символов c1 и c2, начиная с c1.
     *
     * (n = 6, c1='a', c2='b') -> "ababab"
     * (n = 8, c1='x', c2='y') -> "xyxyxyxy"
     */
    private static String myStringBuilder(int n, char ch1, char ch2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");

        if (n > 0) {
            int ind = 0;
            while (ind < n) {
                if (ind % 2 == 0) {
                    stringBuilder.append(ch1);
                } else {
                    stringBuilder.append(ch2);
                }
                ind++;
            }
        }
        return stringBuilder.toString();
    }
    /**
    Создать файл file.txt. Если файл уже создан, ничего делать не надо.
     Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
    **/

    public static void writeInFile() throws IOException {
        String name = "hw2.txt";
        String str  = "TEXT";

        Path path = Path.of(name);
        if (Files.exists(path)) {
        }
        else {
            Files.createFile(path);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(str);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path.toFile());
        fileOutputStream.write(stringBuilder.toString().getBytes());
    }
}
