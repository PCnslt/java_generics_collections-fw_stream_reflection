package com.pcnslt;
import com.pcnslt.NumberUtils;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(NumberUtils.min("John","Cena"));

        String[] strArr = {"James","Andy", "Zulu"};

        Exercise ex = new Exercise();
        int count = ex.countOfGreater(strArr,"Candy");
        System.out.println(count);

//        List intList = new ArrayList<>(List.of(5,2,3,4));
//        addStore(1,intList);

        var bucketList = new ArrayList<>(List.of(
                new Bucket<>(1),
                new Bucket<>(2),
                new Bucket<>(3),
                new Bucket<>(4)
        ));
        addStore(9,bucketList);


    }

    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket = new Bucket<>(t);
        list.add(bucket);
        System.out.println("Item is added successfully: "+t.toString());
        System.out.println("All items: "+list.toString());
    }

    public static <T> List<T> add(List<T> list,T item1, T item2){
        list.add(item1);
        list.add(item2);
        return list;
    }



}

