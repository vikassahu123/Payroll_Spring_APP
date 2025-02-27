package com.example.employeepayrollapp.EmployeePayrollApp.Control;


import com.example.employeepayrollapp.EmployeePayrollApp.DTO.EmployeeDTO;
import com.example.employeepayrollapp.EmployeePayrollApp.Repository.EmployeeRepository;
import com.example.employeepayrollapp.EmployeePayrollApp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeControl {

    @Autowired     //Added for UC1 in section 2 (Services layer)
    private final EmployeeRepository employeeRepository;

    public EmployeeControl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    //Get (Fetching all employees)
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    //Post (Adding new Employees)
    // USING DTO
    @PostMapping
    public Employee addEmployee(@RequestBody EmployeeDTO employeeDTO)
    {
        Employee employee=new Employee(employeeDTO);
        return employeeRepository.save(employee);
    }

    //Put (Updating Employees in Employee via ID
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employeeDTO) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(employeeDTO.getName());
            employee.setDepartment(employeeDTO.getDepartment());
            employee.setSalary(employeeDTO.getSalary());
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    //Delete Deleting employees by Id
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        return "Employee with Id: " + id + " deleted successfully";
    }
}