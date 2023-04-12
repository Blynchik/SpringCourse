package com.zaurtregulov.spring.hibernate_one_to_one;

import com.zaurtregulov.spring.hibernate_one_to_one.entity.Detail;
import com.zaurtregulov.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            Session session = factory.getCurrentSession();
//
//            Employee emp = new Employee("Person", "Surname", "IT", 100500);
//            Detail detail = new Detail("City", "241243", "123@mail.ru");
//
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(emp);
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 10);
            System.out.println(emp.getEmpDetail());

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
