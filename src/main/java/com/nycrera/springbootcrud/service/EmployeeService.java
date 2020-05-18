package com.nycrera.springbootcrud.service;

import com.nycrera.springbootcrud.dao.EmployeeDAO;
import com.nycrera.springbootcrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alperen Asa
 * Date: 18.05.2020
 * Time: 10:49
 * Project Name: springbootcrud
 */

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Transactional
    @Override
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(Employee employee) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
