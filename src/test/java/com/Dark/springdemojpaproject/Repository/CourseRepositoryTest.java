package com.Dark.springdemojpaproject.Repository;
import com.Dark.springdemojpaproject.Entity.Course;
import com.Dark.springdemojpaproject.SpringDemojpaProjectApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest(classes= SpringDemojpaProjectApplication.class)
public class CourseRepositoryTest {
    @Autowired
    CourseRepository repository;
    @Test
    public void findById(){
        Course course=repository.findById(10001L);
        assertEquals(course.getName(),"DSA");
    }
    @Test
    @DirtiesContext   //to avoid dirty read
    public void deleteById(){
        repository.deleteById(10003L);
        assertNull(repository.findById(10003L));
    }
}
