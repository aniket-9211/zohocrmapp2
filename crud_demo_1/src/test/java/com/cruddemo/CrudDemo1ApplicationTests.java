package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entity.Student0;
import com.cruddemo.repository.Student0Repository;

@SpringBootTest
class CrudDemo1ApplicationTests {
	
	@Autowired
	private Student0Repository studentRepo;
	//autowired creates object and gives address to studentRepo
	
	@Test
	void saveOneStudentInfo() {
		Student0 s = new Student0();
		s.setName("Aniket");
		s.setCourse("Full Stack");
		s.setFee(22000);
		studentRepo.save(s);
	}
	
	@Test
	void getOneStudent() {
		Optional<Student0> findById = studentRepo.findById(100L);
		
		if(findById.isPresent()) {
		Student0 s = findById.get();
		
		System.out.println(s.getId());
		System.out.println(s.getCourse());
		System.out.println(s.getName());
		System.out.println(s.getFee());
		}else {
			System.out.println("Record not found");
		}
	}
}
