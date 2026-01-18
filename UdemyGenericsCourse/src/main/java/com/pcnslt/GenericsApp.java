package com.pcnslt;


public class GenericsApp {

    public static void main(String[] args) {


        System.out.println(AdditionHelper.add(1, 2));

// raw type
//        Store store = new Store();
        Store<String> store = new Store<>();
        store.setItem("30.4");
        String item = store.getItem();
        System.out.println("This is the item: " + item);
    }
}
