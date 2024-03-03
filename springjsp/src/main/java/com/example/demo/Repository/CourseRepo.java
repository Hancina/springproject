package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.CourseDto;

@Repository
	public interface CourseRepo extends JpaRepository<CourseDto, String>{

	}

