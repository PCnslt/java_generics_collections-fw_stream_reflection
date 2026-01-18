package com.pcnslt;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

        names.push("John");
        names.push("Tom");
        names.push("Megan");
        names.push("Amy");
        names.push("Julia");

        System.out.println(names.size());
        System.out.println(names.pop());
        System.out.println(names.size());

//        while(!names.isEmpty()){
//            System.out.println(names.pop());
//        }

        names.forEach(System.out::println);

        System.out.println(names.size());

    }
}