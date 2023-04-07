package org.javaKnowledge;

public class Homework2 {

    public static void main(String[] args) {

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
}
