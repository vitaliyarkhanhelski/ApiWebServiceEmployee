package com.example.webuiemployee.repository;

import com.example.webuiemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByOrderByLastNameAsc();
}
