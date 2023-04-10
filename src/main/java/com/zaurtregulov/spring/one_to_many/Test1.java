package com.zaurtregulov.spring.one_to_many;

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

//            session = factory.getCurrentSession();
//            Department dep = new Department("IT", 300, 1200);
//            Employee emp1 = new Employee("A", "AA", 800);
//            Employee emp2 = new Employee("B", "BB", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 1);
            Employee employee = session.get(Employee.class, 1);

            session.delete(employee);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
