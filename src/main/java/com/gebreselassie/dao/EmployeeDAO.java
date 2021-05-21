package com.gebreselassie.dao;

import com.gebreselassie.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    void createEmployee(Employee employee);
    Employee getEmployeeById(int employeeId);
    void deleteEmployeeById(int employeeId);
    void updateEmployeeEmailById(String newEmail, int employeeId);
    List<Employee> getAllEmployeesDetails();
}
