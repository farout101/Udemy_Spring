package net.farout;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("new");
        s1.setRollNo(1);
        s1.setsAge(19);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(net.farout.Student.class);
        cfg.configure();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(s1);

        transaction.commit();

        System.out.println(session.get(net.farout.Student.class, s1.getRollNo()));
    }
}