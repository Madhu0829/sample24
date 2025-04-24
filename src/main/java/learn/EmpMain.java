package learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpMain {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();

        Employee emp = new Employee("Anil",22000,"associate","dev");
        sess.save(emp);
        sess.getTransaction().commit();

    }
}
