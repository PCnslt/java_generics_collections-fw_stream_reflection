package com.pcnslt;

public class GenericClass {

    public <T> void show(T item){
        System.out.println("The item is: "+item.toString());
    }
}
