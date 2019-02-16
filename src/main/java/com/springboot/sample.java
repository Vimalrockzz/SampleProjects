package com.springboot;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springboot.DAO.SpringBootDAO;

import com.springboot.model.SpringBootModel;

public class sample {
		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
			 SpringBootDAO dao=new SpringBootDAO();
			 Connection cn=dao.configDatabase();
			 dao.insertValues(cn, new SpringBootModel("A3","Vimal","PASS",10));
		}
}
