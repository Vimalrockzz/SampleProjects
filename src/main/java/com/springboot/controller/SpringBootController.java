package com.springboot.controller;


import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.SpringBootModel;
import com.springboot.service.SpringBootService;


@RestController
public class SpringBootController {
	


	@RequestMapping(method=RequestMethod.GET,path="/users")
	public List<SpringBootModel> get() throws ClassNotFoundException, SQLException
	{
		SpringBootService service=new SpringBootService();
		return service.retrieveStudents();
	
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/users")
	public void addStudent(@RequestBody SpringBootModel model) throws ClassNotFoundException, SQLException
	{
		SpringBootService service=new SpringBootService();
		service.addUser(model);
	}
	
}
