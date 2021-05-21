package com.gebreselassie.service;

import com.gebreselassie.model.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee fetchEmployeeById(int employeeId);
    void deleteEmployeeById(int employeeId);
    void updateEmployeeEmailById(String newEmail, int employeeId);
    List<Employee> getAllEmployeesInfo();
}
