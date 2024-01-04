package com.web.FirstWebProject.service;

import java.util.List;

import com.web.FirstWebProject.model.Student;

public interface Service {

	Iterable displayAllData();

	List<Student> displaySingleDataData(int uid);

	void saveData(Student s);

	void deleteData(int uid);

//	void updateData(Student s);

}
