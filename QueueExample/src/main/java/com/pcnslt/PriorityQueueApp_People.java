package com.pcnslt;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp_People {

    public static void main(String[] args) {

        //min heap:
        Queue<Person> pQueue = new PriorityQueue<>();

        pQueue.offer(new Person("John",32));
        pQueue.offer(new Person("Ashley",42));
        pQueue.offer(new Person("Julie",35));
        pQueue.offer(new Person("Henna",72));
        pQueue.offer(new Person("Arti",45));


        System.out.println("Peek priority queue: " + pQueue.peek());
        System.out.println("Priority Queue size: " + pQueue.size());

        //heapsort: heap data structure
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }
        System.out.println("Priority Queue size: " + pQueue.size());

    }
}
