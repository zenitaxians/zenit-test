package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int theId) {
        return entityManager.find(Student.class,theId);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("select u FROM Student u where u.lastName =: lastName" +
                                                                " order by u.firstName",
                Student.class);
        theQuery.setParameter("lastName","Doe");
        return theQuery.getResultList();
    }
}
