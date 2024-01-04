package com.web.FirstWebProject.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.FirstWebProject.model.Student;
import com.web.FirstWebProject.repository.Repository;

@Service
public class ServiceImpl implements com.web.FirstWebProject.service.Service {

	@Autowired 
	Repository re;
	
	@Override
	public Iterable displayAllData() {

		return re.findAll();
		
	}
	
	@Override
	public List<Student> displaySingleDataData(int uid) {

		List<Student> findAllByUid = re.findAllByUid(uid);		
		return findAllByUid;
	}
	
	@Override
	public void saveData(Student s) {

		re.save(s);
		
		
	}

	@Override
	public void deleteData(int uid) {
		
		re.deleteById(uid);
		
	}

	/*
	 * @Override public void updateData(Student s) {
	 * 
	 * re.save(s); }
	 */
	

}
