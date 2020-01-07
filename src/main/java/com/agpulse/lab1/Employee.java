package com.agpulse.lab1;

public class Employee {

    private Integer age;
    private String name;
    private Double bonus;
    private Double salary;
    private Double debt;
// To test extending with another field uncomment the following line
//        private String telephone;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", bonus=" + bonus +
                ", salary=" + salary +
                ", debt=" + debt +
                '}';
    }
}
