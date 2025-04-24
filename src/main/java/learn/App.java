package learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        Student st=new Student(5,"pramod","JayaPrakash",2024);
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();
        Session sess=fact.openSession();
        Transaction tx=sess.beginTransaction();

        sess.save(st);

        tx.commit();


    }
}
