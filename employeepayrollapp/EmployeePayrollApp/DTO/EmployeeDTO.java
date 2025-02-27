package com.example.employeepayrollapp.EmployeePayrollApp.DTO;

public class EmployeeDTO {
    public String name;
    public String department;
    public double salary;

    public EmployeeDTO(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
