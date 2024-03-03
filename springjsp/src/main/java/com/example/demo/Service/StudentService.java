package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Dto.StudentDto;
@Service
public class StudentService {
	@Autowired
	StudentDao studentdao;
	public   String insertStudent(StudentDto studentdto) {
	
		 return studentdao.insertStudent(studentdto);
	}

}
