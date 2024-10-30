package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		s1.setRollNo(101);
//		s1.setName("Onkar");
//		s1.setMarks(92);
//
//		s2.setRollNo(102);
//		s2.setName("Prajwal");
//		s2.setMarks(93);
//
//		s3.setRollNo(103);
//		s3.setName("Raj");
//		s3.setMarks(50);
//
//		repo.save(s2);
//		repo.save(s3);

		System.out.println(repo.findById(101));




		//
	}

}
