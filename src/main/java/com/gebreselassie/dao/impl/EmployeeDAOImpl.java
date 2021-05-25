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
        String sql = "SELECT * FROM employee_table WHERE employee_id = ?";
        Employee employee = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), employeeId);
        return employee;
    }

    @Override
    public void deleteEmployeeById(int employeeId) {
        String sql = "DELETE FROM employee_table WHERE employee_id = ?";
        int result = jdbcTemplate.update(sql, employeeId);
        if(result > 0)
            System.out.println("Employee is deleted...");
    }

    @Override
    public void updateEmployeeEmailById(String newEmail, int employeeId) {
        String sql = "UPDATE employee_table SET email = ? WHERE employee_id = ?";
        int update = jdbcTemplate.update(sql, newEmail, employeeId);
        if(update > 0)
            System.out.println("Email is updated ...");
    }

    @Override
    public List<Employee> getAllEmployeesDetails() {
        String sql = "SELECT * FROM employee_table";
        return jdbcTemplate.query(sql, new EmployeeRowMapper());
    }
}
