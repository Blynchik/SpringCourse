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

            session = factory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 3);

            System.out.println(department);
//            System.out.println(department.getEmps());


            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
