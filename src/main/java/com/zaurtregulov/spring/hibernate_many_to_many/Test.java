package com.zaurtregulov.spring.hibernate_many_to_many;

import com.zaurtregulov.spring.hibernate_many_to_many.entity.Child;
import com.zaurtregulov.spring.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Child1", 5);
//            Child child2 = new Child("Child2", 6);
//            Child child3 = new Child("Child3", 7);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);

//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Child child1 = new Child("Igor", 10);
//
//            section1.addChildToSection(child1);
//            section2.addChildToSection(child1);
//            section3.addChildToSection(child1);

            session.beginTransaction();

//            session.save(section1);

//            session.save(child1);
//            session.save(section1);
//            session.save(section2);
//            session.save(section3);

//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//            System.out.println(section.getChildren());

            Child child = session.get(Child.class, 5);

            System.out.println(child);
            System.out.println(child.getSections());

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
