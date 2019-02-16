package com.springboot.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springboot.DAO.SpringBootDAO;
import org.springframework.stereotype.Service;

import com.springboot.model.SpringBootModel;
@Service
public class SpringBootService {
	
	 public List<SpringBootModel> retrieveStudents() throws ClassNotFoundException, SQLException {
		 SpringBootDAO dao=new SpringBootDAO();
		 Connection cn=dao.configDatabase();
		 ArrayList<SpringBootModel> as=dao.retrieveValues(cn);

	        return as;
	    }
	 
	 public void addUser(SpringBootModel model) throws ClassNotFoundException, SQLException
	 {
		 SpringBootDAO dao=new SpringBootDAO();
		 Connection cn=dao.configDatabase();
		 dao.insertValues(cn, model);
	 }

}
