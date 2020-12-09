package com.Dark.springdemojpaproject.Repository;
import com.Dark.springdemojpaproject.Entity.Course;
import com.Dark.springdemojpaproject.SpringDemojpaProjectApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes= SpringDemojpaProjectApplication.class)
public class CourseRepositoryTest {
    @Autowired
    CourseRepository repository;
    @Test
    public void findById(){
        Course course=repository.findById(10001L);
        assertEquals(course.getName(),"DSA");
    }
}
