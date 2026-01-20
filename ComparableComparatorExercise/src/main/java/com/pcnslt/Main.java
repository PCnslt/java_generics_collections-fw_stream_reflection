package com.pcnslt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>(){};

        books.add(new Book("The Book","John Doe", 199));
        books.add(new Book("Helpp","Adam Doe", 33));
        books.add(new Book("No","John Brite", 14));
        books.add(new Book("We will move","Xylo Doe", 2119));

        System.out.println("=".repeat(20));
        System.out.println(books.toString());
        books.forEach(System.out::println);

        System.out.println("=".repeat(20));
        Collections.sort(books,new BookComparator().reversed());
        books.forEach(System.out::println);

        System.out.println("=".repeat(20));

        System.out.println("Count vowels in a sentence:");
        String sentence = "Marry had a little lamb.";
//        String[] vowels = {"a","e","i","o","u"};
        char[] vowels = {'a','e','i','o','u'};
        char[] sArr = sentence.toCharArray();

        int count=0;
        for(char v: vowels){
            for(char s: sArr){
                if(v==s){
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("=".repeat(20));

        List<Person> people = new ArrayList<>();
        people.add(new Person("joe",22));
        people.add(new Person("joe",23));
        people.add(new Person("milli",27));
        people.add(new Person("adam",87));
        people.add(new Person("Carrie",45));
        people.add(new Person("Brian",62));
        people.forEach(System.out::println);

        Collections.sort(people, Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge));
        System.out.println("=".repeat(20));
        people.forEach(System.out::println);


    }
}