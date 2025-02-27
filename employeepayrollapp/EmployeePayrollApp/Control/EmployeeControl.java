package com.example.employeepayrollapp.EmployeePayrollApp.Control;


import com.example.employeepayrollapp.EmployeePayrollApp.DTO.EmployeeDTO;
import com.example.employeepayrollapp.EmployeePayrollApp.Repository.EmployeeRepository;
import com.example.employeepayrollapp.EmployeePayrollApp.Service.InterEmployeeService;
import com.example.employeepayrollapp.EmployeePayrollApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeControl {

    //UC-2- Service Functionality
    @Autowired
    private InterEmployeeService employeeService;  //Injecting Service Layer

    @PostMapping
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        return employeeService.addEmployee(employeeDTO);

    }

    @GetMapping("/get")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployees();

    }

    @GetMapping("/get/{id}")
    public Employee getEmployeeById(@PathVariable Long id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployeeById(@PathVariable Long id,@RequestBody EmployeeDTO employeeDTO)
    {
        return employeeService.updateEmployee(id,employeeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id)
    {
        employeeService.deleteEmployee(id);
    }



}