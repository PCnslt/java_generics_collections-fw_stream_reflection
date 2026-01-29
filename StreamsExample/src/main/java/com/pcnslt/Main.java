package com.pcnslt;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, EmployeeWriteError {
        List<Employee> employees = Employee.getSampleEmployees();

        System.out.println("Before sorting:");
        employees.forEach(e -> System.out.println(e.toFormattedString()));

        Collections.sort(employees, Comparator.comparing(
                (Employee e) -> e.getName()).thenComparing(e -> e.getSalary()));

//        Collections.shuffle(employees);

        Employee highestSalariedEmployee = Collections.max(employees, Comparator.comparing(Employee::getSalary));
        System.out.println("\n\nAfter sorting by name then salary:");
        employees.forEach(e -> System.out.println(e.toFormattedString()));


        int[] nums={1,2,4,5,6,7,75,43};
        Arrays.stream(nums).forEach(System.out::println);

        System.out.println( Arrays.stream(nums).summaryStatistics());

        IntStream.range(1,10).filter(x->x>4).forEach(x->System.out.println(x+" "));

//        Stream.of(employees).sorted(Comparator.comparing()).forEach(System.out::println);


        String[] names = {"John","Adam","Nancy","nancy","Alex"};

        List<String> namesList=Stream.of(names).sorted(Comparator.naturalOrder())
                .filter(x->x.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(namesList);

        List<Integer> streamNums = new ArrayList<>();
        Arrays.stream(nums).filter(x->(x%2)==0).forEach(streamNums::add);
        System.out.println(streamNums);

        //Filter by enum type and print
        System.out.println("Print all employees that are enum type MANAGER:===");
        List<Employee> managerEmployees = employees.stream()
                .filter(e->e.getRoles().equals( Role.MANAGER))
                .collect(Collectors.toList());
        managerEmployees.forEach(System.out::println);

        List<Employee> empSortedByJoinDate = employees.stream()
                .sorted(Comparator.comparing(x->x.getJoinDate()))
                .collect(Collectors.toList());
        empSortedByJoinDate.forEach(System.out::println);

        System.out.println("sort by id and then only print out the empl names:===");
        List<String> empNamesList = employees.stream().sorted(Comparator.comparing(Employee::getId))
                .map(Employee::getName).collect(Collectors.toList());
        empNamesList.forEach(System.out::println);

        //Group by in a MAP

        var empByRole = employees.stream()
                .collect(Collectors.groupingBy(Employee::getRoles));


        System.out.println("Group by role and print Key value pair:===");
        empByRole.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("Print the 2 highest paid employees:===");

        List<String> empHighestSalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .map(Employee::getName)
                .limit(2)
                .collect(Collectors.toList());
        empHighestSalary.forEach(System.out::println);

        System.out.println("Write employees to file:===");

        try(
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("employeeList.txt"));
        ){
            employees.forEach(e-> {
                try {
                    writer.write(String.valueOf(e));
                    writer.newLine();
                } catch (IOException ex) {
                    try {
                        throw new EmployeeWriteError(ex);
                    } catch (EmployeeWriteError exc) {
                        throw new RuntimeException(exc);
                    }
                }
            });
        }

        System.out.println(":====Print employees name length");

        List<String> words = new ArrayList<>(Arrays.asList("Anna", "Adam", "Jenny"));

        words.stream().forEach(name->{
            System.out.println(name.length());
             name.length();
        });

        System.out.println(":====Find all unique characters in a list of Strings");

        String[] arrOfWords = {"Hello", "ShelL"};

        List<String> uniqueLetters= Arrays.stream(arrOfWords).map(w->w.toLowerCase().split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        uniqueLetters.forEach(System.out::println);

        System.out.println(":====Exercise: find all possible combination of a list of numbers");
        /*
    * Mapping exercise
        Your task is that given two lists of numbers ([1, 2, 3], [4, 5]). Generate all pairs of possible numbers!

        So the result in the case should be: (1,4), (1,5), (2,4),(2,5),(3,4),(3,5)

        Good luck!
    * */

        List<Number> intList1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Number> intList2 = new ArrayList<>(Arrays.asList(4,5));


        List<List<Number>> pairs = intList1.stream()
                        .flatMap(i->intList2.stream()
                                .map(j->Arrays.asList(i,j)))
                                .collect(Collectors.toList());

        System.out.println(pairs);

        System.out.println(":===Optionals:");

        System.out.println("Count of employees:"+employees.stream().count());

    }


}