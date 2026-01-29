package com.pcnslt;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalsMain {

    public static void main(String[] args) {

        int maxAge = getMaxEmployeeAge().isPresent() ? getMaxEmployeeAge().get() : 0;

        System.out.println(maxAge);
    }

    public static Optional<Integer> getMaxEmployeeAge(){

        List<Employee> e= Employee.getSampleEmployees();

        Optional<List<Employee>> emp = Optional.of(Employee.getSampleEmployees());

        OptionalInt max =  emp.stream()
                .flatMapToInt(list -> list.stream().mapToInt(Employee::getAge))
                .max();

        return max.isPresent() ? Optional.of(max.getAsInt()) : Optional.empty();
    }
}
