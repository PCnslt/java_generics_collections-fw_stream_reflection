package com.pcnslt;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static <T extends Shape > void drawAll(List<T> shapes){
        for(T shape: shapes){
            shape.draw();
        }
    }

//    public static void print(Object o){
//        System.out.println(o.toString());
//    }

        public static void print(List<?> objList){
        for(Object item:objList){
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {


//    Integer i = 23;

        List<Integer> nums = new ArrayList<>(List.of(1,2,3,4,5));
    print(nums);

    List<Rectangle> rectangles = new ArrayList<>();
    rectangles.add(new Rectangle());
    drawAll(rectangles);
    }
}