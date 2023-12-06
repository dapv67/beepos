package com.beepos.beepos.controller;

import com.beepos.beepos.entity.Employee;
import com.beepos.beepos.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/employees")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public List<Employee> getAll(){
        return this.employeeService.getEmployees();
    }
    @GetMapping("/{employeeId}")
    public Optional<Employee> getById(@PathVariable("employeeId") Long employeeId){
        return employeeService.getEmployee(employeeId);
    }
    @PostMapping
    public void saveUpdate(@RequestBody Employee employee){
         employeeService.saveOrUpdate(employee);
    }
    @DeleteMapping("/{employeeId}")
    public void delete(@PathVariable("employeeId") Long employeeId){
        employeeService.delete(employeeId);
    }
}
