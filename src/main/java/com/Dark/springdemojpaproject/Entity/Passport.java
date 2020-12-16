package com.Dark.springdemojpaproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,unique = true)
    private  String number;

    public Passport() { }

    public Passport(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString(){
        return String.format("Passport[%s]",number);
    }
}
