package net.farout;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(net.farout.Laptop.class)
                .configure()
                .buildSessionFactory(); // cfg.buildSessionFactory();
        Session session = sf.openSession();

        Laptop l1 = session.get(net.farout.Laptop.class, 6);
        System.out.println(l1);
        Laptop l2 = session.get(net.farout.Laptop.class, 7);
        System.out.println(l2);

        session.close();
        sf.close();

    }
}