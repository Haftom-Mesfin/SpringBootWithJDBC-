package com.gebreselassie.service.impl;

import com.gebreselassie.dao.EmployeeDAO;
import com.gebreselassie.model.Employee;
import com.gebreselassie.service.EmployeeService;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Setter
@Getter
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.createEmployee(employee);
    }

    @Override
    public Employee fetchEmployeeById(int employeeId) {

        return employeeDAO.getEmployeeById(employeeId);
    }

    @Override
    public void deleteEmployeeById(int employeeId) {
        employeeDAO.deleteEmployeeById(employeeId);
    }

    @Override
    public void updateEmployeeEmailById(String newEmail, int employeeId) {
        employeeDAO.updateEmployeeEmailById(newEmail, employeeId);
    }

    @Override
    public List<Employee> getAllEmployeesInfo() {

        return employeeDAO.getAllEmployeesDetails();
    }
}
