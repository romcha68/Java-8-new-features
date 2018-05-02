package com.brainacad.oop.testlambda2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by User on 02.05.2018.
 */
public class Main {
    public static void sumEven(Integer[] intArray, Predicate<Integer> predicate) {
    int sum = 0;
    for (Integer element : intArray) {
        if (predicate.test(element)) {
            sum += element;
        }
    }
    System.out.println("Array sum = " + sum);
}

    public static void printJStr(List<String> stringList, Predicate<Integer> predicate) {
        char ch;
        for (String element : stringList) {
            ch = element.charAt(0);
            if (predicate.test(Character.getNumericValue(ch))) {
                System.out.print(element + " ");
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 10, 21, 33, 43, 46, 98, 120, 188, 464, 512, 721};
        List<String> stringList = Arrays.asList("Abc", "Fgt", "Bhgs", "BLAD", "YUIR", "MKADSF", "WERT");

        sumEven(intArray, element -> (element % 2) == 0);

        System.out.print("Strings: ");
        printJStr(stringList, (element) -> element == Character.getNumericValue('B'));
    }
}
