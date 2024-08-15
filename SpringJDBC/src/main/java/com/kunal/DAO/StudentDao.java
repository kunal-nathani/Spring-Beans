package com.kunal.DAO;

import java.util.List;

import com.kunal.model.Student;

public interface StudentDao {

	public int insert(Student student);

	public int UpdateDetails(Student student);

	public int delete(int id);

	public Student getStudentById(int id);

	public List<Student> getAllStudent();

}
