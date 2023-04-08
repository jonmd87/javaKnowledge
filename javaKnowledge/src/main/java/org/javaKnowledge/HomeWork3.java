package org.javaKnowledge;


import java.util.*;


public class HomeWork3 {

    private static final String[] STRINGS = {"681", "java", "php", "-123", "+123", "23fg45"};
    private static final String STRING = "+-1234567890";
    private static final List<Character> CHARS = new ArrayList<>();
    static {
        for (Character ch : STRING.toCharArray()) {
            CHARS.add(ch);
        }
    }

    public static void main(String[] args) {
            // create an integer list
            List<Integer> integerList = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                integerList.add(new Random().nextInt(1, 10));
            }
            System.out.println(integerList);
            removeEvenNumber(integerList);
            System.out.println(integerList);

            // create a string list
            List<String> stringList = new ArrayList<String>();
            for (int i = 0; i < STRINGS.length * 2; i++) {
                stringList.add(STRINGS[new Random().nextInt(STRINGS.length)]);
            }
            System.out.println(stringList);
            removeIntegers(stringList);
            System.out.println(stringList);
        }

        static void removeEvenNumber(List<Integer> numbers) {
            // TODO: 31.03.2023 Удалить все четные элементы из списка
            numbers.removeIf(num -> num % 2 != 0);
        }

        static void removeIntegers(List<String> strings) {
            // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
            System.out.println(strings);
            Iterator iterator = strings.iterator();
            while (iterator.hasNext()) {
                if (isNumber((String) iterator.next())) {
                    iterator.remove();
                }
                }
        }

        static boolean isNumber(String str) {
            for (char ch : str.toCharArray()) {if (!CHARS.contains(ch)) {return false;}}
            return true;
        }
}
