package com.pcnslt;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        //reverse order
        //Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(4,"Four");
        map.put(5,"Five");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(7,"Seven");
        System.out.println(map);

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}