package com.gebreselassie.dao.impl;

import com.gebreselassie.model.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNumber) throws SQLException {

        Employee employee = new Employee();
        employee.setEmployeeId(resultSet.getInt("employee_id"));
        employee.setEmployeeName(resultSet.getString("employee_name"));
        employee.setSalary(resultSet.getDouble("salary"));
        employee.setEmail(resultSet.getString("email"));
        employee.setGender(resultSet.getString("gender"));

        return employee;
    }
}
