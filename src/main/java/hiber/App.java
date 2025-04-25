package hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session sess = sf.openSession();
        sess.beginTransaction();

        Person p1=new Person();
        Person p2=new Person();

        Bike b1=new Bike(1001,"pulsar",92000,p1);
        Bike b2=new Bike(2002,"Apache",77000,p1);

        List<Bike> bikeList1=new ArrayList<>();
        bikeList1.add(b1);
        bikeList1.add(b2);

        Bike b3=new Bike(3005,"honda",92000,p2);
        Bike b4=new Bike(4005,"dominor",77000,p2);

        List<Bike> bikeList2=new ArrayList<>();
        bikeList2.add(b3);
        bikeList2.add(b4);

        p1.setId(1);
        p1.setName("mahi");
        p1.setBikeList(bikeList1);

        p2.setId(2);
        p2.setName("Michel");
        p2.setBikeList(bikeList2);

        sess.persist(p1);
        sess.persist(p2);

        sess.persist(b1);
        sess.persist(b2);
        sess.persist(b3);
        sess.persist(b4);

        sess.getTransaction().commit();
    }
}
