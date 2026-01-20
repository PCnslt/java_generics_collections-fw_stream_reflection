package com.pcnslt;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueApp {

    public static void main(String[] args) {
        //Priority Queue example:

        ////minimum heap:
        // Queue<Integer> pQueue = new PriorityQueue<>();

        //max heap:
        Queue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1, o2);
            }

            @Override
            public Comparator<Integer> reversed() {
                return Comparator.super.reversed();
            }
        });

        pQueue.offer(1);
        pQueue.offer(132);
        pQueue.offer(72);
        pQueue.offer(4321);

        System.out.println("Peek priority queue: " + pQueue.peek());
        System.out.println("Priority Queue size: " + pQueue.size());

        //heapsort: heap data structure
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }
        System.out.println("Priority Queue size: " + pQueue.size());

    }
}
