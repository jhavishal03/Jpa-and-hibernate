package com.Dark.springdemojpaproject.Repository;

import com.Dark.springdemojpaproject.Entity.Course;
import com.Dark.springdemojpaproject.SpringDemojpaProjectApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@SpringBootTest(classes= SpringDemojpaProjectApplication.class)
public class JPQLTestBasic {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    EntityManager em;
    @Test
    public void jpqlBasic(){
        TypedQuery<Course> query=
                em.createNamedQuery("fetch_all_table",Course.class);
        List resultlist=query.getResultList();
        for (Object o : resultlist) {
            System.out.println(o);
        }

        logger.info("select c from Course c->{}",resultlist);
    }
    @Test
    public void jpqltest(){
        TypedQuery<Course> query=
                em.createNamedQuery("fetch_by_fees",Course.class);
        List resultlist=query.getResultList();
        for (Object o : resultlist) {
            System.out.println(o);
        }
        logger.info("select c from Course c where fees > 1000->{}",resultlist);

    }

}
