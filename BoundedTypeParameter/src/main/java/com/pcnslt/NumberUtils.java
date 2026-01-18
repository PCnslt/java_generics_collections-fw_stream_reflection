package com.pcnslt;

public class NumberUtils {

    //we can restrict the types that can be passed to a
    //type parameter.  This is known as bounded type parameter.
    public static <T extends Comparable<T>> T min(T item1, T item2){
        if (item1.compareTo(item2)<0){
            return item1;
        }else{
            return item2;
        }
    }


}
