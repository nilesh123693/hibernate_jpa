package com.OneToMany;

import com.OneToMany.Entity.Address;
import com.OneToMany.Entity.Student1;
import com.OneToMany.respository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {
	@Autowired
	private final StudentRepository studentRepository;

	public OneToManyApplication(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student1 student1  = new Student1();
		student1.setStudentName("nilesh");
		student1.setId(1);
		student1.setAbout("hello");

		Address address1 = new Address();
		address1.setAddId(321);
		address1.setCity("khargone");
		address1.setState("mp");
		address1.setCountry("india");
		address1.setStudent1(student1);

		Address address2 = new Address();
		address2.setAddId(213);
		address2.setCountry("india");
		address2.setState("up");
		address2.setCity("indore");
		address2.setStudent1(student1);

		student1.setList(List.of(address1,address2));

		studentRepository.save(student1);

	}
}
