package com.pcnslt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
//gets converted to Object
//public class Bucket <T >{

////Ensures it's a Number type.
//public class Bucket <T extends Number >{

//Ensures it's a Serializable type.
public class Bucket <T extends Serializable>{
    private T item;

    public Bucket(T item){this.item=item;}

    @Override
    public String toString(){
        return this.item.toString();
    }
}
