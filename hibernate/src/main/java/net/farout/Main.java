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

        Laptop l1 = new Laptop();
        l1.setAid(7);
        l1.setRam(3);
        l1.setBrand("Potato");
        l1.setModel("Oldest");

        Laptop l2 = new Laptop();
        l2.setAid(6);
        l2.setRam(3);
        l2.setBrand("melon");
        l2.setModel("newest");

        Laptop l3 = new Laptop();
        l3.setAid(10);
        l3.setRam(3);
        l3.setBrand("berry");
        l3.setModel("medium");

        Alien a1 = new Alien();
        a1.setAid(7);
        a1.setaName("New Guy");
        a1.setTech("CS");

        Alien a2 = new Alien();
        a2.setAid(10);
        a2.setaName("Old Guy");
        a2.setTech("SE");

        a1.setLaptop(List.of(l1,l2));
        a2.setLaptop(List.of(l1,l2,l3));
        l1.setAliens(Arrays.asList(a1,a2));
        l2.setAliens(Arrays.asList(a1,a2));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(net.farout.Alien.class)
                .addAnnotatedClass(net.farout.Laptop.class)
                .configure()
                .buildSessionFactory(); // cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1);
        session.persist(l2);
        session.persist(l3);
        session.persist(a1);
        session.persist(a2);

        transaction.commit();

        session.close();
        sf.close();

    }
}