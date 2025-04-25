package com.ManytoMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Tech {
    @Id
    int techId;
    String techName;
    @ManyToMany
    List<Trainer> trainerList;

    public Tech() {
    }

    public Tech(int techId, String techName, List<Trainer> trainerList) {
        this.techId = techId;
        this.techName = techName;
        this.trainerList = trainerList;
    }

    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
        this.techId = techId;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    @Override
    public String toString() {
        return "Tech{" +
                "techId=" + techId +
                ", techName='" + techName + '\'' +
                ", trainerList=" + trainerList +
                '}';
    }
}
