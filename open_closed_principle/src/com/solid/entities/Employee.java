package com.solid.entities;

public class Employee {
    private EmployeeType type;
    private int baseSalary;

    public int getSalary() {
        if (type == EmployeeType.PERMANENT) {
            return baseSalary * 150 / 100;
        } else {
            return baseSalary;
        }
    }
}
