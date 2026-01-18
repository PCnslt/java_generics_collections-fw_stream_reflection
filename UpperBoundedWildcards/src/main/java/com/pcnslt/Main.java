package com.pcnslt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<? extends Number> l1 = new ArrayList<Integer>();
        // cannot insert items into List<? extends T> wildcard object
        //l1.add(new Integer(12));

        List<? extends Number> l2 = new ArrayList<Double>();
        List<? extends Number> l3 = new ArrayList<Float>();
        List<? extends Number> l4 = new ArrayList<Long>();

        //we use upper bounded wildcards to read items
        List<Integer> nums = new ArrayList<>();
        showAll(Arrays.asList(1.2f, 2.3f));

        System.out.println(sumAll(Arrays.asList(1.2,2.3,43)));
    }

    private static void showAll(List<? extends Number> nums) {
        for(Number n: nums){
            System.out.println(n);
        }
    }

    private static double sumAll(List<? extends Number> list){
        double sum=0;
        for(Number n: list){
            sum = sum+n.doubleValue();
        }
       return sum;
    }


}