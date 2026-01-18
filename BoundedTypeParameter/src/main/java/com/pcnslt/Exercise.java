package com.pcnslt;

public class Exercise {

    public <T extends Comparable<T>> int countOfGreater(T[] arrT, T item){

        int count=0;
        for(T eachItem: arrT){
            if(eachItem.compareTo(item)>0){
                count++;
            }
        }
        return count;
    }
}
