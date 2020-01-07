package com.agpulse.lab1;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class EmployeeBuilderImpl implements EmployeeBuilderService {

    private Employee employee = new Employee();
    private int numberOfParametersAdded = 0;

    public EmployeeBuilderImpl withName(String name) {
        employee.setName(name);
        this.numberOfParametersAdded++;
        return this;
    }

    public EmployeeBuilderImpl withBonus(double bonus) {
        employee.setBonus(bonus);
        this.numberOfParametersAdded++;
        return this;
    }

    public EmployeeBuilderImpl withAge(int age) {
        employee.setAge(age);
        this.numberOfParametersAdded++;
        return this;
    }

    public EmployeeBuilderImpl withSalary(double salary) {
        employee.setSalary(salary);
        this.numberOfParametersAdded++;
        return this;
    }

    public EmployeeBuilderImpl withDebt(double debt) {
        employee.setDebt(debt);
        this.numberOfParametersAdded++;
        return this;
    }

    public Employee build() throws EmployeeException {
        if(this.employee.getClass().getDeclaredFields().length > this.numberOfParametersAdded){
            throw new EmployeeException("Field is missing. All parameters are mandatory for Employee.");
        }
        return this.employee;

    }

//    public Employee build() throws EmployeeException, IllegalAccessException {
//        Field[] fields = employee.getClass().getDeclaredFields();
//
//        ArrayList<String> emptyFields = new ArrayList<>();
//
//
//        for (Field field : fields){
//            field.setAccessible(true);
//            Type type = field.getType();
//            Object fieldValue = field.get(employee);
//            String fieldName = field.getName();
//          System.out.println("field name: " + fieldName + ", type: "+ field.getType() + " , field value: " + fieldValue);
//            if (field.getType().isPrimitive()){
//                throw new EmployeeException(fieldName + " must be an object, instead of " + type);
//            }
//            if (fieldValue == null ){
//                emptyFields.add(fieldName);
//            }
//        }
//
//        if (emptyFields.size() > 0){
//            String errorMessageSuffix = "";
//            if (emptyFields.size() == 1) {
//                errorMessageSuffix = "field is missing.";
//            }
//            else {
//                errorMessageSuffix = "fields are missing";
//            }
//            throw new EmployeeException(emptyFields + " " + errorMessageSuffix);
//        }
//
//        return employee;
//    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
