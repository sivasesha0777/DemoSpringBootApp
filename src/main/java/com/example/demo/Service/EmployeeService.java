package com.example.demo.Service;


import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {


 EmployeeRepo employeeRepo;

    public void createEmployee(Employee employee) {
        employeeRepo.save(employee);

    }

    public List<Employee> findAllEmployees() {
       List<Employee> listEmp = employeeRepo.findAll();
       return listEmp;
    }

    public void  deleteEmployeeById(Long id){
        employeeRepo.deleteById(id);

    }

    public Employee updateEmployee(Employee employee) {
        Long id=employee.getId();
        Optional<Employee> optionalEmployee =employeeRepo.findById(id);
        if(optionalEmployee.isPresent()){
            employeeRepo.save(employee);
        }
return employee;
    }

    public Employee employeeById(Long id) {

        return employeeRepo.findById(id).orElseThrow();
    }
}
