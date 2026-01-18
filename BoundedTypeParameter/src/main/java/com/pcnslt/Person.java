package com.pcnslt;

import lombok.Data;

@Data
public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return this.name+"-"+this.age;
    }

    @Override
    public int compareTo(Person otherPerson){
        return Integer.compare(this.age, otherPerson.getAge());
    }
}
