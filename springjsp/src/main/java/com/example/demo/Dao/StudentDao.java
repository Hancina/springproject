package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dto.StudentDto;
import com.example.demo.Repository.StudentRepo;
@Component
public class StudentDao {
@Autowired
StudentRepo st;
	public String insertStudent(StudentDto studentdto) {
		
		st.save(studentdto);
		
		return "student details uploaded ";
	}

	}


