package com.zaurtregulov.spring.hibernate_one_to_one;

import com.zaurtregulov.spring.hibernate_one_to_one.entity.Detail;
import com.zaurtregulov.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Employee emp = new Employee("Nik", "Mik", "IT", 100500);
//            Detail detail = new Detail("Town", "241243", "77777@mail.ru");
//
//            detail.setEmployee(emp);
//            emp.setEmpDetail(detail);


            session.beginTransaction();

            Detail detail = session.get(Detail.class, 2);
//            System.out.println(detail.getEmployee());
            session.delete(detail);

//            session.save(detail);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
