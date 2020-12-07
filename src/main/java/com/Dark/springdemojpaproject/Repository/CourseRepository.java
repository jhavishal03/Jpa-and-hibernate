package com.Dark.springdemojpaproject.Repository;

import com.Dark.springdemojpaproject.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {
    @Autowired
    EntityManager manager;
    public Course findById(Long id){
        return manager.find(Course.class,id);
    }
}
