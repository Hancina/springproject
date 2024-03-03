package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CourseDao;
import com.example.demo.Dto.CourseDto;
@Service
public class CourseService {
	@Autowired
	CourseDao courseDao;
	
	public String insertCourse(CourseDto courseDto) {
		return courseDao.insertCourse(courseDto);
	}
}

