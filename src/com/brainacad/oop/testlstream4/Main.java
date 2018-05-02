package com.brainacad.oop.testlstream4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by User on 02.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        Stream<Integer> streamIterate = Stream.iterate(10, i -> i + 10);

        List<Integer> list = streamIterate.limit(10)
                .map(number -> number / 2)
                .collect(Collectors.toList());

        System.out.println("Integer stream list: " + list);

        List<String> strings = Arrays.asList("Abigail", "Brontos", "Claus", "Dorn", "Erasmus", "Fire", "Fuel", "Xeon", "Yaml", "Wonder");

        System.out.print("Select words \"F*\": ");
        strings.stream().sorted((String a, String b) -> (a.charAt(0) - b.charAt(0)))
                .filter(s -> s.startsWith("F"))
                .forEach(s -> System.out.print(s + " "));

        List<Person> persons = new ArrayList();
        persons.add(new Person("John", 18, true));
        persons.add(new Person("Martin", 15, true));
        persons.add(new Person("Mary", 30, false));
        persons.add(new Person("Franz", 23, true));
        persons.add(new Person("Lucile", 29, false));

        System.out.println("Military men: ");
        persons.stream()
                .filter(person -> (person.getGender() && person.getAge() >= 18 && person.getAge() <= 27))
                .forEach(person -> System.out.println("\t" + person));

        double averageAge = persons.stream()
                .filter(person -> !person.getGender())
                .mapToInt(woman -> woman.getAge())
                .average()
                .orElse(0);
        System.out.println("The average woman age is: " + averageAge);
    }
}
