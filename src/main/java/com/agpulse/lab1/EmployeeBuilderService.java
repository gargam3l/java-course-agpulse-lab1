package com.agpulse.lab1;

public interface EmployeeBuilderService {
    public EmployeeBuilderImpl withName(String name);

    public EmployeeBuilderImpl withBonus(double bonus);

    public EmployeeBuilderImpl withAge(int age);

    public EmployeeBuilderImpl withSalary(double salary);

    public EmployeeBuilderImpl withDebt(double debt);

    public Employee build() throws EmployeeException, IllegalAccessException;
}