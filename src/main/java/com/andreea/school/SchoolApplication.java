package com.andreea.school;

import com.andreea.school.model.Student;
import com.andreea.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;


	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Student student= new Student();
		student.setStudentFirstName("Adi");
		student.setStudentLastName("Mihai");

		Student student1= new Student();
		student1.setStudentFirstName("Adi1");
		student1.setStudentLastName("Mihai1");

		studentRepository.save(student);
		studentRepository.save(student1);

		for (Student s:studentRepository.findAll()
			 ) {
			System.out.println(s.getStudentFirstName()+" "+s.getStudentId());

		}


	}
}
