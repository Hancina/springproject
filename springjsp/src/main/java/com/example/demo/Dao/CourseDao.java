package com.example.demo.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Dto.CourseDto;
import com.example.demo.Repository.CourseRepo;

@Component
public class CourseDao {
@Autowired
CourseRepo courseRepo;
	
public String insertCourse(CourseDto courseDto) {
	courseRepo.save(courseDto);
	return "course info saved";
}
}

