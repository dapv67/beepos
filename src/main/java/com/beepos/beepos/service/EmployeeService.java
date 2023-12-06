package com.beepos.beepos.service;

import com.beepos.beepos.entity.Employee;
import com.beepos.beepos.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    public Optional<Employee> getEmployee(Long id){
        return employeeRepository.findById(id);
    }

    public void saveOrUpdate(Employee employee){
        employeeRepository.save(employee);
    }
    public void delete(Long id){
        employeeRepository.deleteById(id);
    }
}
