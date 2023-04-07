package org.javaKnowledge;

public class Lesson2 {

    public static void main(String[] args) {
        String str = "acbbbeeemdddhha";
        System.out.println(compress(str));
        System.out.println(isPalindrome("abccba"));
        System.out.println(isPalindrome("abccbsa"));
        System.out.println(isPalindrome("abcdcba"));
        System.out.println(isPalindrome("a"));
        System.out.println(stringBuilder(5, 'a', 'b'));
        System.out.println(stringBuilder(6, 'a', 'b'));
        System.out.println(stringBuilder(5, 'a', 'b'));
        System.out.println(stringBuilder(0, 'a', 'b'));
    }

    /**
     * Дано четное число N (>0) и символы c1 и c2.
     * Написать метод, который вернет строку длины N,
     * которая состоит из чередующихся символов c1 и c2, начиная с c1.
     *
     * (n = 6, c1='a', c2='b') -> "ababab"
     * (n = 8, c1='x', c2='y') -> "xyxyxyxy"
     */
    private static String stringBuilder(int n, char ch1, char ch2) {
        StringBuilder stringBuilder = new StringBuilder(n);
        int ind = 0;
        while (ind <  n) {
            if (ind % 2 == 0) {
                stringBuilder.append(ch1);
            }
            else {
                stringBuilder.append(ch2);
            }
            ind++;
        }
        return stringBuilder.toString();
    }


    /**
     * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
     * aaaabbbcdd -> a4b3cd2
     * abcda -> abcda
     */
    static String compress(String source) {
        char[] str = source.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            int count = 1;
            stringBuilder.append(str[i]);
            while (i < (str.length - 1) && str[i] == str[i + 1]) {
                i++;
                count++;
            }
            if (count > 1) {
                stringBuilder.append(count);
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Определить, является ли строка палиндромом
     *
     * abcde -> false
     * abcba -> true
     * a -> true
     */
    static boolean isPalindrome(String source){
        boolean answer = false;
        int ind = 0;
        char[] str = source.toCharArray();
        int length = str.length;
        while (ind < length / 2  && str[ind] == str[length - ind - 1]) {
            ind++;
        }
        if (ind == length / 2) {
            answer = true;
        }
        return answer;
    }
}
