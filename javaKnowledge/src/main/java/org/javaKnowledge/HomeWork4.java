package org.javaKnowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork4 {
    /**
    ** Реализовать приложение, которое:
    ** Принимает от пользователя и запоминает строки
    ** Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
    ** Если введено revert, то удаляем последнюю введеную строку
    ** Если введено exit, то завершаем программу
    **/
    static private final String EXIT = "exit";
    static private final String PRINT = "print";
    static private final String REVERT = "revert";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String input;

        while (!EXIT.equals(input = (scanner.nextLine()).toLowerCase())) {
            switch (input) {
                case PRINT :
                    System.out.println(list);
                    break;
                case REVERT:
                    if (list.size() > 0) {list.remove(0);}
                    break;
                default:
                    list.add(0, input);
                    break;
            }
        }
    }
}
