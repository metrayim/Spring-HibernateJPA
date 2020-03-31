package com.kshrd.HibernateJpa.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PakingSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String location;

    public PakingSpace() {
    }
    public PakingSpace(String location){

        this.location=location;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "PakingSpace{" +
                "id=" + id +
                ", location='" + location + '\'' +
                '}';
    }
}
