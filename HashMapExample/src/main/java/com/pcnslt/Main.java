package com.pcnslt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<Integer,String> map= new HashMap<>();

        //O(1) IF THERE IS NO COLLISION
        map.put(1,"John");
        map.put(2,"Amy");
        map.put(3,"Leela");
        map.put(4,"Any");

        System.out.println("keySet:"+map.keySet());
        System.out.println("values:"+map.values());

        for(Integer key: map.keySet()){

            List<Integer> keyList = new ArrayList<>();
            System.out.println("Key:"+key);
            keyList.add(key);
            System.out.println("Value:"+map.get(key));

        }

        System.out.println("Another way of printing map values.");
        //Another way of seeing your entire map
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }


    }
}