package com.quantify.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.quantify.dao.LearnHubDao;
import com.quantify.dto.LearnHub;
import com.quantify.dto.LearnHubPojo;

@Path("/learn-hub")
public class LearnHubServiceImpl {

	@Autowired
	LearnHubDao learnHubDao;
	
	@GET
	@Path("/courses")
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	public List<LearnHub> getAllCourses()
	{
	  List<LearnHubPojo> courseList = learnHubDao.getAllCourses();
	  List<LearnHub> courseListObj = new ArrayList<LearnHub>();
	  LearnHub course = null;
	  for(LearnHubPojo obj: courseList)
	  {
		  course = new LearnHub();
		  course.setPnum(obj.getPnum());
		  course.setCategory(obj.getCategory());
		  course.setDescription(obj.getDescription());
		  course.setImage(obj.getImage());
		  course.setPrice(obj.getPrice());
		  course.setRating(obj.getRating());
		  course.setTitle(obj.getTitle());
		  course.setType(obj.getType());
		  course.setUrl(obj.getUrl());
		 
		  courseListObj.add(course);
	  }
	  
	  return courseListObj;
	}
	
	@POST
	@Path("/create-course")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public LearnHub saveCourse(LearnHub obj)
	{
   		LearnHubPojo course = new LearnHubPojo();
		  course.setCategory(obj.getCategory());
		  course.setDescription(obj.getDescription());
		  course.setImage(obj.getImage());
		  course.setPrice(obj.getPrice());
		  course.setRating(obj.getRating());
		  course.setTitle(obj.getTitle());
		  course.setType(obj.getType());
		  course.setUrl(obj.getUrl());
		learnHubDao.createCourse(course);
		return obj;
	}
	
	@GET
	@Path("/courses/{pnum}")
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	public LearnHub getCourse(@PathParam("pnum") int pnum)
	{
	  LearnHubPojo obj = learnHubDao.getCourse(pnum);
	  
	  LearnHub course = new LearnHub();
	  
	  course.setPnum(obj.getPnum());
	  course.setCategory(obj.getCategory());
	  course.setDescription(obj.getDescription());
	  course.setImage(obj.getImage());
	  course.setPrice(obj.getPrice());
	  course.setRating(obj.getRating());
	  course.setTitle(obj.getTitle());
	  course.setType(obj.getType());
	  course.setUrl(obj.getUrl());
      
	  return course;
	}
	
	@GET
	@Path("/courses/{title}")
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	public LearnHub getCourse(@PathParam("title") String title)
	{
	  LearnHubPojo obj = learnHubDao.getCourse(title);
	  
	  LearnHub course = new LearnHub();
	  
	  course.setPnum(obj.getPnum());
	  course.setCategory(obj.getCategory());
	  course.setDescription(obj.getDescription());
	  course.setImage(obj.getImage());
	  course.setPrice(obj.getPrice());
	  course.setRating(obj.getRating());
	  course.setTitle(obj.getTitle());
	  course.setType(obj.getType());
	  course.setUrl(obj.getUrl());
      
	  return course;
	}
	@GET
	@Path("/courses/count")
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	public Integer getCoursesCount()
	{
	  List<LearnHubPojo> courseList = learnHubDao.getAllCourses();
	  return courseList.size();
	}
}
