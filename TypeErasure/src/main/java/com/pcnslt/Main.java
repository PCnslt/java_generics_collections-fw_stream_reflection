package com.pcnslt;

import java.lang.reflect.Field;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Bucket<Integer> bucket = new Bucket<Integer>(2);
        System.out.println(bucket.toString());

        Field field = Bucket.class.getDeclaredField("item");
        field.setAccessible(true);
        System.out.println("Field Type: "+field.getType());

    }
}