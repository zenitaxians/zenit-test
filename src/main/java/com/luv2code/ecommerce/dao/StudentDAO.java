package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(int theId);

    List<Student> findAll();

    List<Student> findStudentByLastName(String lastName);

    void updateStudent(Student student);

    void deleteStudent(Integer Id);

    int deleteAllStudents();

    void deleteByLastName(String lastname);
}
