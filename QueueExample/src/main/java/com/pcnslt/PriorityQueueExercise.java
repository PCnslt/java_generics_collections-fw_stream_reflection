package com.pcnslt;
/*
* PriorityQueue exercise
Implement a task management system that uses a PriorityQueue to schedule and execute tasks. Each task has:

id: A unique identifier

priority: An integer value (higher means more important)

dueDate: A LocalDate representing when the task is due

There are 2 classes to implement:

Task class that has several field variables and the logic how to compare the taks objects. IMPORTANT:  if priority is the same, compare the tasks based on the dueDate ASC !!!

TaskExecutor that stores these tasks in a PriorityQueue and we can add new tasks and execute these tasks if needed based on the compare logic that is present in the Task class
* */

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;

public class PriorityQueueExercise {
    public static void main(String[] args) {

        TaskExecutor te = new TaskExecutor();

        te.addTask(new Task(UUID.randomUUID(), 5, LocalDate.of(2026, 1, 20)));
        te.addTask(new Task(UUID.randomUUID(), 6, LocalDate.of(2026, 1, 22)));
        te.addTask(new Task(UUID.randomUUID(), 15, LocalDate.of(2026, 2, 20)));
        te.addTask(new Task(UUID.randomUUID(), 5, LocalDate.of(2026, 2, 20)));
        te.addTask(new Task(UUID.randomUUID(), 11, LocalDate.of(2026, 1, 20)));


        te.hasTasks();

        te.executeTask();
        te.hasTasks();

    }
}

@Data
@AllArgsConstructor
class Task implements Comparable<Task>{
    // TODO: add fields and the logic
    private UUID id;
    private int priority;
    private LocalDate dueDate;

    @Override
    public int compareTo(Task other) {
        int priorityCompare = Integer.compare(other.priority, this.priority);
        if(priorityCompare!=0){
            return priorityCompare;
        }else{
            return this.dueDate.compareTo(other.dueDate);
        }
    }
}

class TaskExecutor {
    private PriorityQueue<Task> priorityQueue= new PriorityQueue<Task>();

    public void addTask(Task task) {
        System.out.println("Adding task: "+task.toString());
        this.priorityQueue.offer(task);
    }

    public Task executeTask() {
        System.out.println("Executing task: "+priorityQueue.peek());
        return this.priorityQueue.poll();
    }

    public boolean hasTasks() {
        System.out.println("Number of tasks in queue: "+this.priorityQueue.size());

        List<Task> sortedTaskList = new ArrayList<>(this.priorityQueue);

        sortedTaskList.sort(null);
        sortedTaskList.forEach(System.out::println);

        return !this.priorityQueue.isEmpty();
    }
}