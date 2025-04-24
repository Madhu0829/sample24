package learn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    int KodId;
    String name;
    String address;
    int yop;
    public Student(){

    }

    public Student(int KodId,String name,String address,int yop) {
        super();
        this.KodId = KodId;
        this.name = name;
        this.address = address;
        this.yop = yop;
    }

    public int getKodId() {
        return KodId;
    }

    public void setKodId(int kodId) {
        KodId = kodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "KodId=" + KodId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", yop=" + yop +
                '}';
    }
}
