package com.pcnslt;//package com.pcnslt;
//
///*
//*
//* Your task is to implement a generic stack (MyStack<T>) from scratch:
//
//Support the following operations:
//
//push(T element)
//
//T pop()
//
//T peek()
//
//boolean isEmpty()
//
//int size()
//*
//* */
//
//import java.util.LinkedList;
//import java.util.List;
//
//public class Exercise<T> {
//
//
//    // TODO: Define internal storage (array or list)
//    private T item;
//    List<T> localStorageList = new LinkedList<>();
//
//    // TODO: Constructor
//    public Exercise(T item){
//        this.item=item;
//    }
//
//    public void push(T element) {
//        // TODO: Add element to top
//        localStorageList.addFirst(element);
//    }
//
//    public T pop() {
//        // TODO: Remove and return top element
//        var value = localStorageList.getFirst();
//        localStorageList.removeFirst();
//        return value;
//    }
//
//    public T peek() {
//        // TODO: Return top element without removing
//        return localStorageList.getFirst();
//    }
//
//    public boolean isEmpty() {
//        // TODO: Return true if stack is empty
//        return localStorageList.isEmpty();
//    }
//
//    public int size() {
//        // TODO: Return number of elements
//        return localStorageList.size();
//    }
//}

import java.util.ArrayList;

public class Exercise<T> {
    private ArrayList<T> stack;

    public Exercise() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
