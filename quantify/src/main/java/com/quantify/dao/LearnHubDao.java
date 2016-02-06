package com.quantify.dao;

import java.util.List;

import com.quantify.dto.LearnHubPojo;

public interface LearnHubDao {

	public void createCourse(LearnHubPojo course);
	public LearnHubPojo getCourse(int pnum);
	public LearnHubPojo getCourse(String title);
	public void updateCourse();
	public void deleteCourse();
	
	public List<LearnHubPojo> getAllCourses();
	public void deleteAllCourses();

}
