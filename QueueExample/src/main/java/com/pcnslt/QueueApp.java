package com.pcnslt;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QueueApp {
    public static void main(String[] args) {

        //Queue example:

        Queue<String> queue = new LinkedList<>();

        queue.offer("John");
        queue.offer("Amy");
        queue.offer("Karen");
        queue.offer("Tim");

        System.out.println("Queue size: "+queue.size());

        System.out.println(queue.peek());

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("Queue size: "+queue.size());



    }
}