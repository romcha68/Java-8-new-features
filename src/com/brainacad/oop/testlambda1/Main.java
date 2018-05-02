package com.brainacad.oop.testlambda1;

import java.util.*;

/**
 * Created by User on 02.05.2018.
 */
public class Main {public static void main(String[] args) {
    Integer[] intArray = new Integer[10];
    Random random = new Random();

    for (int i = 0; i < intArray.length; i++) {
        intArray[i] = random.nextInt(100);
    }
    System.out.println("Array: " + Arrays.toString(intArray));
    Arrays.sort(intArray, (a, b) -> a.compareTo(b) * -1);
    System.out.println("Sorted Array: " + Arrays.toString(intArray));

    List<String> stringList = new ArrayList<>();
    stringList.add("Abc");
    stringList.add("Fgt");
    stringList.add("Bhgs");
    stringList.add("BLAD");
    stringList.add("YUIR");
    stringList.add("MKADSF");
    stringList.add("WERT");

    System.out.println("List: " + stringList);
    Collections.sort(stringList, (a, b) -> a.compareTo(b) * -1);
    System.out.println("Sorted List: " + stringList);
}
}
