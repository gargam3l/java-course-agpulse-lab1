package com.agpulse.lab1;

public class EmployeeExecutor {
    public static void main(String[] args) {
        EmployeeBuilderService employeeWorkingExample = new EmployeeBuilderImpl();
        EmployeeBuilderService employeeMissingFieldExample = new EmployeeBuilderImpl();

        try {
            System.out.println("Working example:");
            employeeWorkingExample.withAge(23).withBonus(1000).withDebt(500).withName("Yehuda").withSalary(10000).build();
            System.out.println(employeeWorkingExample.toString());
            System.out.println("Not working example:");
            employeeMissingFieldExample.withAge(23).withName("Mendel").withSalary(10000).withBonus(1000).build();
            System.out.println(employeeMissingFieldExample.toString());
        } catch (EmployeeException e) {
            System.out.println("Error:");
            System.out.println(e.getMessage());
        }
    }
}
