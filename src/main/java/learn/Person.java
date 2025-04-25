package learn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
    @Id
    int id;
    String nickname;
    @OneToOne
    AadharCard card;

    public Person() {
    }

    public Person(int id, String nickname, AadharCard card) {
        this.id = id;
        this.nickname = nickname;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public AadharCard getCard() {
        return card;
    }

    public void setCard(AadharCard card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", card=" + card +
                '}';
    }
}
