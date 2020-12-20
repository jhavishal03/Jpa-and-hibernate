package com.Dark.springdemojpaproject.Repository;

import com.Dark.springdemojpaproject.Entity.Course;
import com.Dark.springdemojpaproject.Entity.Passport;
import com.Dark.springdemojpaproject.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {
    @Autowired
    EntityManager manager;
    public Student findById(Long id){
        return manager.find(Student.class,id);
    }
    public void deleteById(Long id){
        Student student=findById(id);
        manager.remove(student);
    }
    public Student saveStudent(Student student){
        if(student.getId()==null){
            manager.persist(student); //insert
        }
        else{
            manager.merge(student);
        }
        return student;
    }
    public void saveStudentWithPassport(){
        Passport passport=new Passport("X14Y78H");
        manager.persist(passport);
        Student student=new Student("Rajan Pandey",22);
        student.setPassport(passport);
        manager.persist(student);
    }
}
