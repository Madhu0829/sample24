package learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();
        Session sess=fact.openSession();

        Student st=sess.get(Student.class,5);
        System.out.println(st);
    }
}
