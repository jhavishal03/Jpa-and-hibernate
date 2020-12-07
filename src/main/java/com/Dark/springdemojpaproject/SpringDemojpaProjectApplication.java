package com.Dark.springdemojpaproject;

import com.Dark.springdemojpaproject.Entity.Course;
import com.Dark.springdemojpaproject.Repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemojpaProjectApplication implements CommandLineRunner {
    @Autowired
	CourseRepository repository;
    private Logger logger= LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args)
	{
		SpringApplication.run(SpringDemojpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course=repository.findById(10001L);
		logger.info("Course 10001--> ",course);

	}
}
