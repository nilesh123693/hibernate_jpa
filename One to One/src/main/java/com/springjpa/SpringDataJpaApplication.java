package com.springjpa;

import com.springjpa.Entity.Laptop;
import com.springjpa.Entity.Student;
import com.springjpa.repositroy.StudentRepository;
import com.sun.source.doctree.SinceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication  implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {

		SpringApplication.run(SpringDataJpaApplication.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student();
//		student1.setStudentName("nilesh prajapat");
//		student1.setId(1);
//		student1.setAbout("software engineer");
//
//		Laptop laptop1 = new Laptop();
//		laptop1.setLaptopId(21);
//		laptop1.setBrand("dell");
//		laptop1.setModelNumber("1334");
//		laptop1.setStudent(student1);
//
//		student1.setLaptop(laptop1);
//
//
//		studentRepository.save(student1);


		Student student  = studentRepository.findById(1).get();

		System.out.println(student);

		Laptop laptop  = student.getLaptop();
		System.out.println(laptop);



	}
}
