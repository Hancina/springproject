package com.example.demo.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
	public class CourseDto {
	@Id
	private String cname;
	private int cfees;
	private String cduration;
	private String course;
	public String getCname() 
	{
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCfees() {
		return cfees;
	}
	public void setCfees(int cfees) {
		this.cfees = cfees;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	@Override
	public String toString() {
		return "CourseDto [cname=" + cname + ", cfees=" + cfees + ", cduration=" + cduration + "]";
	}
	}

