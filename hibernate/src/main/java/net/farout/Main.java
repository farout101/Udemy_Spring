package net.farout;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setRam(3);
        l1.setBrand("Potato");
        l1.setModel("Oldest");

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setaName("New Guy");
        a1.setTech("CS");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(net.farout.Alien.class)
                .configure()
                .buildSessionFactory(); // cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();

        session.close();
        sf.close();

    }
}