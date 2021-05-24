package com.gebreselassie.dao.impl;

import com.gebreselassie.dao.EmployeeDAO;
import com.gebreselassie.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createEmployee(Employee employee) {
        String sql = "INSERT INTO employee_table(employee_name, salary, email, gender) VALUES(?, ?, ?, ?)";
        int update = jdbcTemplate.update(sql,
                employee.getEmployeeName(),
                employee.getSalary(),
                employee.getEmail(),
                employee.getGender());
        if(update > 0){
            System.out.println("Employee created ...");
        }

    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        return null;
    }

    @Override
    public void deleteEmployeeById(int employeeId) {

    }

    @Override
    public void updateEmployeeEmailById(String newEmail, int employeeId) {

    }

    @Override
    public List<Employee> getAllEmployeesDetails() {
        return null;
    }
}
