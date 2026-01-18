package com.pcnslt;


public class GenericsApp {

    public static void main(String[] args) {


//        System.out.println(AdditionHelper.add(1, 2));
//
//// raw type
////        Store store = new Store();
//        Store<String> store = new Store<>();
//        store.setItem("30.4");
//        String item = store.getItem();
//        System.out.println("This is the item: " + item);
//

        //Multiple Types in generic
        Hashtable<String, Integer, Double> hashtable = new Hashtable<>("apple", 23);
        System.out.println(hashtable);

        GenericClass gc = new GenericClass();
        gc.show(hashtable.getValue(),"Just testing");


    }
}
