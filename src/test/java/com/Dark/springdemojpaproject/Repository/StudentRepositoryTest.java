package com.Dark.springdemojpaproject.Repository;

import com.Dark.springdemojpaproject.Entity.Passport;
import com.Dark.springdemojpaproject.Entity.Student;
import com.Dark.springdemojpaproject.SpringDemojpaProjectApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@SpringBootTest(classes = SpringDemojpaProjectApplication.class)
public class StudentRepositoryTest {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    EntityManager manager;
    @Test
    @Transactional
    public void retrieveStudentAndPassport(){
        Student student=manager.find(Student.class,20002L);
        logger.info("student -> {}", student);
        logger.info("passport -> {}", student.getPassport());
    }
    @Test
    @Transactional
    public void retrievePassportAndStudentAssociated(){
        Passport passport=manager.find(Passport.class,30003L);
        logger.info("passport -> {}", passport);
        logger.info("student -> {}", passport.getStudent());
    }
}
