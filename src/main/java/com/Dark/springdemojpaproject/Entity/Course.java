package com.Dark.springdemojpaproject.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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


    @OneToMany(mappedBy = "course")
    private List<Review> reviews=new ArrayList<>();
    protected Course() {
    }
    @ManyToMany(mappedBy = "courses")
    private List<Student> students=new ArrayList<>();

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

    public List<Student> getStudents() {
        return students;
    }
    public void addStudents(Student student) {
        this.students.add(student);
    }

    public void removeStudents(Student student) {
        this.students.remove( student);
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public List<Review> getReviews() {
        return reviews;
    }


    public void addReview(Review reviews) {
        this.reviews.add( reviews);
    }

    public void removeReview(Review reviews) {
        this.reviews.remove( reviews);
    }
    @Override
    public String toString() {
        return String.format("Course[%-50s%10d]",name,fees);
    }

}
