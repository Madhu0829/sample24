package learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App5 {
    public static void main(String[] args) {

    }
    public static void create_table(){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();


    }
    public static void insert_data(){
        Student st=new Student(5,"pramod","JayaPrakash",2024);
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();
        Session sess=fact.openSession();
        Transaction tx=sess.beginTransaction();

        sess.persist(st);

        tx.commit();
    }
    public static void update_data(){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();
        Session sess=fact.openSession();

        Student st=sess.get(Student.class,2);
        st.setYop(2021);

        Transaction tx=sess.beginTransaction();
        sess.merge(st);
        tx.commit();
    }
    public static void fetch_data(){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();
        Session sess=fact.openSession();

        Student st=sess.get(Student.class,5);
        System.out.println(st);
    }
    public static void delete_data(){
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");


        SessionFactory fact= cfg.buildSessionFactory();
        Session sess=fact.openSession();

        Student st=sess.get(Student.class,2);

        Transaction tx=sess.beginTransaction();
        sess.remove(st);
        tx.commit();
    }
}
