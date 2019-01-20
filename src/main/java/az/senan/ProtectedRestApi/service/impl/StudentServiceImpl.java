package az.senan.ProtectedRestApi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import az.senan.ProtectedRestApi.model.Student;
import az.senan.ProtectedRestApi.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudent(int id) {
		
		return getAllStudents().get(id);
	}

	@Override
	public List<Student> getAllStudents() {
		
		List<Student> list=new ArrayList<Student>();
		
		Student student1=new Student("Sanan", "Javadov", "+994555770549", "sananjavadov98@gmail.com");
		Student student2=new Student("Nijat", "Mammadov", "+994552583969", "hi@nicat.org");
		Student student3=new Student("Ulvi", "Verdiyev", "+994517097062", "u.verdiyev@gmail.com");
		Student student4=new Student("Tale", "Mammadov", "+994517948549", "talemammad@gmail.com");
		Student student5=new Student("Ulvi", "Suleiman", "+994505314243", "ulvisuleiman@gmail.com");
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		
		return list;
	}

}
