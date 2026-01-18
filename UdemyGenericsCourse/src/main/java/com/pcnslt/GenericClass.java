package com.pcnslt;

public class GenericClass {

    public <T, V> void show(T item1, V item2){
        System.out.println("The item1 is: "+item1.toString());
        System.out.println("The item2 is: "+item2.toString());
    }
}
