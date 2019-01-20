package az.senan.ProtectedRestApi.service;

import java.util.List;

import az.senan.ProtectedRestApi.model.Student;

public interface StudentService {

	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
}
