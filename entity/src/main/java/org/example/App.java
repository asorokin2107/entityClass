package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App 
{
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        Session session = sessionFactory.openSession();
        Course course = session.get(Course.class, 3);
        Student student = session.get(Student.class, 10);
        Teacher teacher = session.get(Teacher.class, 4);
        Subscription subscription = session.get(Subscription.class, new SubscriptionKey(1, 2));
        Purchase purchase = session.get(Purchase.class, new PurchaselistKey("Амбражевич Порфирий", "Веб-разработчик c 0 до PRO"));
        System.out.println(purchase);
        System.out.println(subscription);
        System.out.println(teacher);
        System.out.println(student);
        System.out.println(course);


        sessionFactory.close();
    }
}
