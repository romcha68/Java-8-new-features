package com.brainacad.oop.testlambda3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by User on 02.05.2018.
 */
public class Main {
    public static List<String> strings = Arrays.asList("Stol", "Stul", "Divan");

    public static void main(String[] args) {
        updateList();
        Consumer<String> consumer = (str) -> System.out.println(str);
        strings.forEach(consumer);
    }

    public static void updateList() {
        MyConverter myConverter = (str -> {
            if (!MyConverter.isNull(str)) {
                return str.toUpperCase();
            } else {
                return null;
            }
        });

        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, myConverter.convertStr(strings.get(i)));
        }
    }
}

interface MyConverter {
    String convertStr(String str);

    static boolean isNull(String str) {
        return str == null;
    }
}
