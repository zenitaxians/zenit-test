package com.luv2code.ecommerce;

import com.luv2code.ecommerce.dao.StudentDAO;
import com.luv2code.ecommerce.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.security.PublicKey;
import java.util.List;

@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createMultipleStudents(studentDAO);
		};
	}

	private void deleteByLastName(StudentDAO studentDAO) {
		String lastname = "Doe";
		studentDAO.deleteByLastName(lastname);
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("We have deleted: " + studentDAO.deleteAllStudents() + " rows");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 5;
		studentDAO.deleteStudent(studentId);
		System.out.println("Student with Id: " + studentId + " was deleted");
	}

	private void updateStudent(StudentDAO studentDAO) {
		Student student = studentDAO.findById(1);
		student.setFirstName("Zenit");
		student.setLastName("Neziri");
		studentDAO.updateStudent(student);
		System.out.println(student);
	}

	public void findByLastName(StudentDAO studentDAO){
		List<Student> students = studentDAO.findStudentByLastName("Doe");
		for(Student student : students){
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		List<Student> students = studentDAO.findAll();

		for (Student student: students){
			System.out.println(student);
		}
	}

	private void createStudent(StudentDAO studentDAO) {

		Student tempStudent = new Student("Tea", "Cock", "ana@luv2code.com");

		studentDAO.save(tempStudent);

		System.out.println("Saved student"+ tempStudent.getFirstName() + " with this  id: " + tempStudent.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void readStudent(StudentDAO studentDAO) {

		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");

		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		Student myStudent = studentDAO.findById(theId);

		System.out.println("Found the student: " + myStudent);
	}
}
