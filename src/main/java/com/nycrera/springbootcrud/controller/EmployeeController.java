package com.nycrera.springbootcrud.controller;

import com.nycrera.springbootcrud.model.Employee;
import com.nycrera.springbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Alperen Asa
 * Date: 18.05.2020
 * Time: 10:48
 * Project Name: springbootcrud
 */

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee save(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee get(@PathVariable int id) {

        Employee employee = employeeService.get(id);

        if(employee == null) {
            throw new RuntimeException("Employee with id " + id + " is not found!");
        }

        return employee;
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        employeeService.delete(id);

        return "Employee has been deleted with id: " + id;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public Employee update(@RequestBody Employee employee) {
        employeeService.save(employee);
        return employee;
    }

}
