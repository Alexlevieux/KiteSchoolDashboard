package com.KiteSchoolDashboard.global;

import java.util.List;

public class Student {
	
	
	
	private List<Object> completedLessons;
	private int numberOfLessons;
	private String id;
	private String firstName;
	private String surName;
	private int lessonsBalance;
	
	public List<Object> getLessons() {
		return completedLessons;
	}
	public void setLessons(List<Object> lessons) {
		this.completedLessons = lessons;
	}
	public int getNumberOfLessons() {
		return numberOfLessons;
	}
	public void setNumberOfLessons(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getLessonsBalance() {
		return lessonsBalance;
	}
	public void setLessonsBalance(int lessonsBalance) {
		this.lessonsBalance = lessonsBalance;
	}
	public Student(List<Object> lessons, Integer numberOfLessons, String id, String firstName, String surName,
			Integer lessonsBalance) {
		super();
		this.completedLessons = lessons;
		this.numberOfLessons = numberOfLessons;
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.lessonsBalance = lessonsBalance;
	}
	
	
	
}

	
	
	
