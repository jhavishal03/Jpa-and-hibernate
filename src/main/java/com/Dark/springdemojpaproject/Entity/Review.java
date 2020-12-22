package com.Dark.springdemojpaproject.Entity;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    private  int rating;

    private  String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private Course course;
    public Review() {
    }

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating=rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString(){
  return String.format("Review[%d %s]",rating,description);
    }

}
