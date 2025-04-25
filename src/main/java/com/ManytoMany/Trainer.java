package com.ManytoMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Trainer {
    @Id
    int trainerId;
    String trainerName;
    @ManyToMany
    List<Tech> techList;

    public Trainer() {
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public List<Tech> getTechList() {
        return techList;
    }

    public void setTechList(List<Tech> techList) {
        this.techList = techList;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", trainerName='" + trainerName + '\'' +
                ", techList=" + techList +
                '}';
    }
}
