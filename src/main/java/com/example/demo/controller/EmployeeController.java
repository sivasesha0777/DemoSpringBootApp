package com.example.demo.controller;

import com.example.demo.Service.EmployeeService;
import com.example.demo.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
class EmployeeController {


    EmployeeService employeeService;
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);
        return employee;
    }
    @GetMapping("/employeeAll")
    public List<Employee> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping
    public Employee getEmployeeById(Long id) {
        return employeeService.employeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployeeById(id);
    }

    @PutMapping("update")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.createEmployee(employee);

        return employee;
    }
}
