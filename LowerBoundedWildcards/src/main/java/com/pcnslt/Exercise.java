package com.pcnslt;

/*

Wildcards exercise
In the previous lectures we have discussed wildcards - both upper bounded and lower bounded wildcards. In this exercise, your task is to implement copy method (it is present in Collections by the way) that's able to copy the items from a source list into a destination list. Use wildcards with the appropriate bounds!

Hint: you have to copy the items from one of the lists into another list (so there are read and write operations accordingly).
*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise {


    public static <T> void copy(List<? extends T> source, List<? super T> destination) {

        for(int i=0; i<source.size(); i++){
            destination.add(source.get(i));
        }

    }

    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>(Arrays.asList(
                "John", "Adam", "Kylie", "Megan"
        ));

        System.out.println("Source List: "+sourceList.toString());

        List<String> destList = new ArrayList<>();
        System.out.println("Destination List: "+destList.toString());

        copy(sourceList,destList);
        System.out.println("AfterCopy: Source List: "+sourceList.toString());
        System.out.println("AfterCopy: Destination List: "+destList.toString());

    }

}
