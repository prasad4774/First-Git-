package com.web.FirstWebProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.web.FirstWebProject.model.Student;
import com.web.FirstWebProject.service.Service;

@RestController
public class Controller {

	@Autowired
	Service ser;
	
	@RequestMapping(value = "/getAllData",method = RequestMethod.GET)
	public Iterable getAllData() {
		
		Iterable list=ser.displayAllData();
		
		return list;
	}
	
	@RequestMapping(value = "/getSingleData/{uid}",method = RequestMethod.GET)
	public List<Student> getSingleData(@PathVariable("uid") int uid) {
		
		List<Student> list = ser.displaySingleDataData(uid);
		
		return list;
		
		
		
	}
	
	@PostMapping("/reg")
	public String RegData(@RequestBody Student s) {
		
		ser.saveData(s);
		
		return "insert Success";
		
	}
	
	@DeleteMapping("/deleteData/{uid}")
	public String deleteData(@PathVariable("uid") int uid) {
		
		
		ser.deleteData(uid);
		
		
		return "Data deleted successFully";
	
	}
	
	
	@PutMapping("/putData")
	public String putAllData(@RequestBody Student s) {
		
		ser.saveData(s);
		
		
		return "DataUpdated";
		
	}
	
	
	  @PutMapping("/updateData/{uid}") 
	  public String updateAllData(@PathVariable("uid") int uid,@RequestBody Student s) {
	  
	  ser.saveData(s);
	  
	  
	  return "Data updated Successfully";
	  
	  }
	 
	
	
}
