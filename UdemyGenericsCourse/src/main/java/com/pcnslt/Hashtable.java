package com.pcnslt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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
