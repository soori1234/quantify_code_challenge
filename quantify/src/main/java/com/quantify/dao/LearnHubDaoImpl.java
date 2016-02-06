package com.quantify.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quantify.dto.LearnHubPojo;

@Repository
public class LearnHubDaoImpl implements LearnHubDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	@Transactional
	public void createCourse(LearnHubPojo course) {
		
		session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(course);
	}

	@Transactional
	public LearnHubPojo getCourse(int pnum) {
		String hql = "select c from LearnHubPojo c where c.pnum=:pnum";
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("pnum", pnum);
		LearnHubPojo course = (LearnHubPojo) query.uniqueResult();
		return course;
	}

	public void updateCourse() {
		// TODO Auto-generated method stub
		
	}

	public void deleteCourse() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<LearnHubPojo> getAllCourses() {
		session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(LearnHubPojo.class);
		List<LearnHubPojo> courseList = criteria.list();
		return courseList;
	}

	public void deleteAllCourses() {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public LearnHubPojo getCourse(String title) {
		String hql = "select c from LearnHubPojo c where c.title=:title";
		session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setParameter("pnum", title);
		LearnHubPojo course = (LearnHubPojo) query.uniqueResult();
		return course;
	}

}
