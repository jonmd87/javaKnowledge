package org.javaKnowledge;

import java.util.HashMap;
import java.util.Map;

public class HomeWork5 {
    static String parenthesesString = "(){}<>[]";
    static Map<Character, Integer> parenthesesMap = new HashMap<>();

    public static void main(String[] args) {
        initMap(parenthesesMap);

        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true


    }

    /**
     * Дана последовательность скобочек. Проверить, что она является корректной.
     */
    static boolean isCorrectParentheses(String parentheses) {
        // TODO: 07.04.2023 Вписать решение!
        // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
        /**
        * НЕ совсем понял как использовать DEQUE в данном примере
         * */
        // Нужно использовать Deque. !!!
        // Открывающуюся скобку вносим в Deque (insertFirst)
        // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся
        char[] array = parentheses.toCharArray();
        int result = 0;
        for (int i = 0; i < parentheses.length(); i++) {
            result += parenthesesMap.get(array[i]);
        }
        return (result == 0) ? true : false;
    }

    static void initMap(Map<Character, Integer> parenthesesMap) {
            char[] array = parenthesesString.toCharArray();
            for (int i = 0; i < parenthesesString.length(); i++) {
                parenthesesMap.put(array[i], (i % 2 == 0 ? -1 : 1));
            }
        }
}
