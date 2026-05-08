package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepo extends JpaRepository<User, Long> {
}
