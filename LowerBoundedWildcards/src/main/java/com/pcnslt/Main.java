package com.pcnslt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

//    public static void showAll(List<? super Number> list){
//        for(Number number: list){ //Error: Cannot be used to read number
//            System.out.println(number);
//        }
//    }

        public static void showAll(List<? super Number> list){
        for(Object number: list){
            System.out.println(number);
        }
    }


    public static void main(String[] args) {

        List<? super Integer> l1 = new ArrayList<Integer>();
        List<? super Integer> l2 = new ArrayList<Number>();
        List<? super Integer> l3 = new ArrayList<Object>();

        List<Serializable> list = new ArrayList<>();
        list.add("Adam");
        list.add("Kevin");
        list.add("Ana");
        showAll(list);
    }

}