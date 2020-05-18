package com.nycrera.springbootcrud.dao;

import com.nycrera.springbootcrud.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Alperen Asa
 * Date: 18.05.2020
 * Time: 10:50
 * Project Name: springbootcrud
 */

@Repository
public class EmployeeDAO implements IEmployeeDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Employee> getAll() {
        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();

        return list;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }

    @Override
    public void delete(int id) {

    }

}
