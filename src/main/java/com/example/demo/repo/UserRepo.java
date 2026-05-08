package com.example.demo.repo;

import com.example.demo.entity.Employee;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

interface UserRepo extends JpaRepository<User, Long> {
    List<Employee> findByDepartmentId(Long departmentId);

}
