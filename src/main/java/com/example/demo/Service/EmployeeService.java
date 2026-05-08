package com.example.demo.Service;


import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

   @Autowired
   private EmployeeRepo employeeRepo;

    public void createEmployee(Employee employee) {
        employeeRepo.save(employee);

    }

    public List<Employee> findAllEmployees() {
        List<Employee> list=employeeRepo.findAll();
        return list;
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
}
