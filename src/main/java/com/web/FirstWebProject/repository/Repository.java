package com.web.FirstWebProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.web.FirstWebProject.model.Student;

import antlr.collections.List;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Student, Integer> {

	public java.util.List<Student> findAllByUid(int uid);
	
//	void deleteByUid(Integer uid);
}
