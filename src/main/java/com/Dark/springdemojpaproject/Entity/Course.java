package com.Dark.springdemojpaproject.Entity;

import javax.persistence.*;

@Entity
@NamedQueries(value = {
        @NamedQuery(name = "fetch_all_table",query = "select c from Course c"),
        @NamedQuery(name = "fetch_by_fees",query = "select c from Course c where fees > 1000")
}
)
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private int fees;

    protected Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", fees=" + fees +
                '}';
    }

    public Course(String name, int fees) {
        this.name = name;
        this.fees = fees;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

}
