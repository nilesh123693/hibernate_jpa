package com.imageupload.save.image.in.db;

import com.imageupload.save.image.in.db.entity.Course;
import com.imageupload.save.image.in.db.entity.Student;
import com.imageupload.save.image.in.db.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.util.Date;

@SpringBootApplication
public class SaveImageInDbApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {

		SpringApplication.run(SaveImageInDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setAge(21);
		student.setName("nilesh");
		student.setCity("khargone");
		student.setSid(211);
		student.setDate(new Date());

		Course course = new Course();
		course.setCid(333);
		course.setCourseName("Btech");

		student.setCourse(course);


		studentRepository.save(student);
	}
}
