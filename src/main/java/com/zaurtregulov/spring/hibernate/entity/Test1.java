package com.zaurtregulov.spring.one_to_many_uni.entity;

import com.zaurtregulov.spring.one_to_many.entity.Department;
import com.zaurtregulov.spring.one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

            session = factory.getCurrentSession();
            Department dep = new Department("HR", 500, 1500);
            Employee emp1 = new Employee("Abc", "AAtrr", 800);
            Employee emp2 = new Employee("Bcd", "BByyop", 1000);

            dep.addEmployeeToDepartment(emp1);
            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();

            session.save(dep);
            session.save(emp1);
            session.save(emp2);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
