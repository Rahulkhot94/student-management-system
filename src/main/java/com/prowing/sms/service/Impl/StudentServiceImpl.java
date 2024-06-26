package com.prowing.sms.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prowing.sms.entity.Student;
import com.prowing.sms.repository.StudentRepository;
import com.prowing.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository repository;

	public StudentServiceImpl(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<Student> getAllStudents() {

		return repository.findAll();

	}

	@Override
	public Student saveStudent(Student student) {

		return repository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {

		return repository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {

		return repository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {

		repository.deleteById(id);
	}

}
