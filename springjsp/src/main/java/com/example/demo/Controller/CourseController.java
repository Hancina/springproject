package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Dto.CourseDto;
import com.example.demo.Service.CourseService;
@Controller
public class CourseController {
	@Autowired
	CourseService courseService;

	@GetMapping("/c")
	public String chtml() {
		return "Course.html";
	}

	@PostMapping("/cinsert")
	@ResponseBody
	public String insertCourse(@ModelAttribute CourseDto courseDto) {
		// System.out.println(courseDto);
		return courseService.insertCourse(courseDto);
	}
}
