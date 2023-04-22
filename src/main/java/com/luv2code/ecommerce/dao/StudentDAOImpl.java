package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Transactional
    @Override
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

    @Override
    public List<Student> findStudentByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery("select u from Student u where u.lastName =: lastName", Student.class);
        query.setParameter("lastName",lastName);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteStudent(Integer Id) {
        Student student = entityManager.find(Student.class,Id);
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAllStudents() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return numRowsDeleted;
    }

    @Override
    @Transactional
    public void deleteByLastName(String lastname) {
        String queryString = "DELETE FROM Student s WHERE s.lastName = :lastName";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("lastName", lastname);
        int deletedCount = query.executeUpdate();
        if (deletedCount > 0) {
            System.out.println("There are " + deletedCount + " students deleted, with surname " + lastname);
        } else {
            System.out.println("There are no students matching " + lastname + " surname");
        }
    }
}
