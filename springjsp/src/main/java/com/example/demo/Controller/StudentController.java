package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.StudentDto;
import com.example.demo.Service.StudentService;
@RestController
@RequestMapping("/students")
public class StudentController {
   
   @Autowired 
    StudentService studentService;

   
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
 
	@PostMapping("/sinsert")
	@ResponseBody
	public String insertStudent(@ModelAttribute StudentDto studentdto) {
		String course= studentdto.getCourse();
		int sid= studentdto.getSid();
		String sname= studentdto.getSname();
		String smail= studentdto.getSemail();
		

		return studentService.insertStudent(studentdto);
	}

	
	
}
