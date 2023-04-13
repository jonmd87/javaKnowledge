package org.javaKnowledge;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Seminar5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("name", 10);
        map.put("value", 13);
        printHashMap(map);

        map.computeIfPresent("name", new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return 1111;
            }
        });
        map.computeIfAbsent("vasea", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 123;
            }
        });

        map.computeIfAbsent("vasea", new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return 444;
            }
        });
        printHashMap(map);

    }
    static void printHashMap (Map<String, Integer> map) {
        System.out.println();
        for(String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }
    }
}
