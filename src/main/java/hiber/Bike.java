package hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bike {
    @Id
    int modelNum;
    String brand;
    int price;
    @ManyToOne
    Person person;

    public Bike() {
    }

    public Bike(int modelNum, String brand, int price, Person person) {
        this.modelNum = modelNum;
        this.brand = brand;
        this.price = price;
        this.person = person;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "modelNum=" + modelNum +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", person=" + person +
                '}';
    }
}

