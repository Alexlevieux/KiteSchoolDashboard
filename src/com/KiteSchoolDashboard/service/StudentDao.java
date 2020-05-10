package com.KiteSchoolDashboard.service;

import java.util.List;

import com.KiteSchoolDashboard.global.Student;

public interface StudentDao {
	public List<Student> getAllStudents();
	public Student getStudent(String id);
	public List<Student> getStudents(String searchQuery);
	public List<Student> getStudentswithIds(String[] ids);
	public String updateStudent(String id);
	public String[] updateStudents (String ids);
	public String createStudent(Student student);
	public String[] createStudents(List<Student> students);
	public void	deleteStudent(String id);
	public void deleteStudents(String[] ids);
	

}
