package com.Dark.springdemojpaproject.Repository;

import com.Dark.springdemojpaproject.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {
    @Autowired
    EntityManager manager;
    public Course findById(Long id){
        return manager.find(Course.class,id);
    }

    public void deleteById(Long id){
        Course course=findById(id);
        manager.remove(course);
    }
    public Course saveCourse(Course course){
        if(course.getId()==null){
            manager.persist(course); //insert
        }
        else{
            manager.merge(course);
        }
        return course;
    }
}
