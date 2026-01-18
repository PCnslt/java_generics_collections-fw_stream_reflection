package com.pcnslt;

public class Hashtable <K, V, E>{

    private K key;
    private V value;

    public Hashtable(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return this.key+"-"+this.value;
    }
}
