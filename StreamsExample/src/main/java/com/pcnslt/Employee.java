package com.pcnslt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import java.time.LocalDate;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private LocalDate joinDate;
    private int age;
    private String city;
    private List<Role> roles;  // Changed from Role to List<Role>

    public static List<Employee> getSampleEmployees() {
        return Arrays.asList(
                Employee.builder()
                        .id(101)
                        .name("Alice Johnson")
                        .department("Engineering")
                        .salary(75000)
                        .joinDate(LocalDate.of(2020, 3, 15))
                        .age(28)
                        .city("New York")
                        .roles(Arrays.asList(Role.MANAGER, Role.DEVELOPER))  // Multiple roles
                        .build(),

                Employee.builder()
                        .id(102)
                        .name("Bob Smith")
                        .department("Sales")
                        .salary(65000)
                        .joinDate(LocalDate.of(2019, 7, 22))
                        .age(35)
                        .city("Chicago")
                        .roles(Arrays.asList(Role.DEVELOPER))  // Single role as list
                        .build(),

                Employee.builder()
                        .id(103)
                        .name("Charlie Brown")
                        .department("Engineering")
                        .salary(82000)
                        .joinDate(LocalDate.of(2021, 1, 10))
                        .age(32)
                        .city("New York")
                        .roles(Arrays.asList(Role.TESTER, Role.DEVELOPER))  // Multiple roles
                        .build(),

                Employee.builder()
                        .id(104)
                        .name("Diana Prince")
                        .department("HR")
                        .salary(58000)
                        .joinDate(LocalDate.of(2018, 11, 5))
                        .age(29)
                        .city("Los Angeles")
                        .roles(Arrays.asList(Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(105)
                        .name("Ethan Hunt")
                        .department("Sales")
                        .salary(72000)
                        .joinDate(LocalDate.of(2020, 9, 30))
                        .age(40)
                        .city("Chicago")
                        .roles(Arrays.asList(Role.MANAGER, Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(106)
                        .name("Fiona Gallagher")
                        .department("Engineering")
                        .salary(95000)
                        .joinDate(LocalDate.of(2017, 6, 18))
                        .age(45)
                        .city("Boston")
                        .roles(Arrays.asList(Role.DEVELOPER, Role.MANAGER))  // Senior dev who is also manager
                        .build(),

                Employee.builder()
                        .id(107)
                        .name("George Miller")
                        .department("Marketing")
                        .salary(62000)
                        .joinDate(LocalDate.of(2022, 2, 14))
                        .age(26)
                        .city("New York")
                        .roles(Arrays.asList(Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(108)
                        .name("Hannah Wells")
                        .department("HR")
                        .salary(54000)
                        .joinDate(LocalDate.of(2021, 8, 19))
                        .age(31)
                        .city("Chicago")
                        .roles(Arrays.asList(Role.MANAGER))
                        .build(),

                Employee.builder()
                        .id(109)
                        .name("Ian Cooper")
                        .department("Engineering")
                        .salary(88000)
                        .joinDate(LocalDate.of(2019, 4, 10))
                        .age(38)
                        .city("San Francisco")
                        .roles(Arrays.asList(Role.DEVELOPER, Role.TESTER))  // Full stack developer
                        .build(),

                Employee.builder()
                        .id(110)
                        .name("Julia Roberts")
                        .department("Finance")
                        .salary(67000)
                        .joinDate(LocalDate.of(2021, 11, 25))
                        .age(29)
                        .city("Boston")
                        .roles(Arrays.asList(Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(111)
                        .name("Kevin Lee")
                        .department("Engineering")
                        .salary(91000)
                        .joinDate(LocalDate.of(2018, 8, 14))
                        .age(42)
                        .city("Austin")
                        .roles(Arrays.asList(Role.TESTER, Role.MANAGER))
                        .build(),

                Employee.builder()
                        .id(112)
                        .name("Lisa Wong")
                        .department("Marketing")
                        .salary(78000)
                        .joinDate(LocalDate.of(2020, 5, 19))
                        .age(34)
                        .city("Seattle")
                        .roles(Arrays.asList(Role.MANAGER))
                        .build(),

                Employee.builder()
                        .id(113)
                        .name("Michael Chen")
                        .department("Sales")
                        .salary(69000)
                        .joinDate(LocalDate.of(2022, 3, 8))
                        .age(27)
                        .city("New York")
                        .roles(Arrays.asList(Role.DEVELOPER))
                        .build(),

                Employee.builder()
                        .id(114)
                        .name("Nina Patel")
                        .department("Engineering")
                        .salary(83000)
                        .joinDate(LocalDate.of(2019, 9, 12))
                        .age(31)
                        .city("Chicago")
                        .roles(Arrays.asList(Role.TESTER))
                        .build(),

                Employee.builder()
                        .id(115)
                        .name("Oscar Martinez")
                        .department("Operations")
                        .salary(59000)
                        .joinDate(LocalDate.of(2021, 7, 30))
                        .age(33)
                        .city("Los Angeles")
                        .roles(Arrays.asList(Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(116)
                        .name("Paula Rodriguez")
                        .department("Engineering")
                        .salary(102000)
                        .joinDate(LocalDate.of(2016, 12, 1))
                        .age(48)
                        .city("San Francisco")
                        .roles(Arrays.asList(Role.MANAGER, Role.DEVELOPER))  // Tech lead
                        .build(),

                Employee.builder()
                        .id(117)
                        .name("Quincy Adams")
                        .department("HR")
                        .salary(56000)
                        .joinDate(LocalDate.of(2022, 6, 15))
                        .age(25)
                        .city("Boston")
                        .roles(Arrays.asList(Role.DEVELOPER))
                        .build(),

                Employee.builder()
                        .id(118)
                        .name("Rachel Green")
                        .department("Marketing")
                        .salary(71000)
                        .joinDate(LocalDate.of(2020, 2, 28))
                        .age(30)
                        .city("New York")
                        .roles(Arrays.asList(Role.TESTER, Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(119)
                        .name("Sam Wilson")
                        .department("Sales")
                        .salary(64000)
                        .joinDate(LocalDate.of(2021, 10, 11))
                        .age(28)
                        .city("Austin")
                        .roles(Arrays.asList(Role.BUSINESS_ADMIN))
                        .build(),

                Employee.builder()
                        .id(120)
                        .name("Tina Turner")
                        .department("Engineering")
                        .salary(89000)
                        .joinDate(LocalDate.of(2018, 3, 22))
                        .age(39)
                        .city("Seattle")
                        .roles(Arrays.asList(Role.DEVELOPER))
                        .build()
        );
    }

    // Update your formatted string to handle List<Role>
    public String toFormattedString() {
        String rolesStr = roles != null ?
                roles.toString().replaceAll("[\\[\\]]", "") :
                "No Roles";

        return String.format("ID: %-3d | Name: %-20s | Dept: %-12s | Roles: %-20s | Salary: $%,8.2f | Age: %2d | City: %-12s | Joined: %s",
                id, name, department, rolesStr, salary, age, city, joinDate);
    }

    // Helper method to check if employee has a specific role
    public boolean hasRole(Role roleToCheck) {
        return roles != null && roles.contains(roleToCheck);
    }

    // Helper method to add a role
    public void addRole(Role roleToAdd) {
        if (roles == null) {
            roles = new java.util.ArrayList<>();
        }
        if (!roles.contains(roleToAdd)) {
            roles.add(roleToAdd);
        }
    }

    // Helper method to remove a role
    public void removeRole(Role roleToRemove) {
        if (roles != null) {
            roles.remove(roleToRemove);
        }
    }
}