package com.nycrera.springbootcrud.service;

import com.nycrera.springbootcrud.model.Employee;

import java.util.List;

/**
 * Created by Alperen Asa
 * Date: 18.05.2020
 * Time: 10:49
 * Project Name: springbootcrud
 */

public interface IEmployeeService {

    List<Employee> getAll();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);

}
