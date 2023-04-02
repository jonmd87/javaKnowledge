package org.javaKnowledge;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

//        System.out.println("1980 " + (isLeapYear(1980))); //true
//        System.out.println("1990 " + (isLeapYear(1990))); //false
//        System.out.println("1991 " + (isLeapYear(1991))); //false
//        System.out.println("1992 " + (isLeapYear(1992))); //true
//        System.out.println("1994 " + (isLeapYear(1994))); //false
//        System.out.println("2016 " + (isLeapYear(2016))); //true
//        System.out.println("2064 " + (isLeapYear(2064))); //true
//        System.out.println("2082 " + (isLeapYear(2082))); //false

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];

//        int[] arr = new int[] {1, 0, 1, 0, 1, 0, 1, 0, 1, 1};
//        System.out.println(Arrays.toString(arr));
//        invertOneToZero(arr);
//        System.out.println(Arrays.toString(arr));

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int min = 10;
        int max = 20 + 1;
        int sum = a + b;

        return (sum > min && sum < max);
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return (x > 0);
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        while (repeat-- > 0) {
            System.out.printf(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        return (year % 4 == 0 || (year % 100 != 0 && year % 400 == 0));
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     **/
    private static void invertOneToZero(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }


    /**
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     **/
    private static void multiplyTwo (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 6;
        }
    }
/**
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
}