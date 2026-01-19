package com.pcnslt;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm:ss a '['VV']' (zzzz)");

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println("Local Date Time: "+ldt);
        System.out.println("Local Date Time Formatted: "+ldt.atZone(ZoneId.of("Europe/London")).format(dtFormatter));

        long now = System.currentTimeMillis();
        ZonedDateTime zdt = Instant
                .ofEpochMilli(now)
                .atZone(ZoneId.of("Asia/Dhaka"));
        System.out.println("Zoned Date Time: "+zdt);
        System.out.println("Zoned Date Time Formatted: "+zdt.format(dtFormatter));

        System.out.println("=".repeat(50));

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);
        System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.println("Deleting Stack item (pop): "+stack.peek());
            stack.pop();
        }

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(10);
        queue.offer(100);
        queue.offer(1000);
        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println("Deleting Queue item (poll): "+queue.peek());
            queue.poll();
        }

    }
}