package com.example.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.ems.entity.Employee;
import com.example.ems.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee saveEmployee(Employee emp) {
        return repository.save(emp);
    }

    public Employee updateEmployee(Long id, Employee newEmp) {
        Employee emp = getEmployeeById(id);
        emp.setName(newEmp.getName());
        emp.setEmail(newEmp.getEmail());
        emp.setDepartment(newEmp.getDepartment());
        return repository.save(emp);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}