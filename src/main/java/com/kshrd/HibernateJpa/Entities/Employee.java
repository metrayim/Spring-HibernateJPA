package com.kshrd.HibernateJpa.Entities;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Double  salary;

    @ManyToOne
    private Dapartment dapartment;
    @OneToOne(optional = false)
    private PakingSpace pakingSpace;

    public Employee() {
    }
    public Employee(String name,Double salary,Dapartment dapartment,PakingSpace pakingSpace){
        this.name=name;
        this.salary=salary;
        this.dapartment=dapartment;
        this.pakingSpace=pakingSpace;
    }

    public PakingSpace getPakingSpace() {
        return pakingSpace;
    }

    public void setPakingSpace(PakingSpace pakingSpace) {
        this.pakingSpace = pakingSpace;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Dapartment getDapartment() {
        return dapartment;
    }

    public void setDapartment(Dapartment dapartment) {
        this.dapartment = dapartment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dapartment=" + dapartment +
                ", pakingSpace=" + pakingSpace +
                '}';
    }
}
