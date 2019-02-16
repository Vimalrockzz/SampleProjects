package org.springboot.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.springboot.model.SpringBootModel;

public class SpringBootDAO {
	
	public Connection configDatabase() throws ClassNotFoundException, SQLException{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/sample","root","password");
		return con;
	
	}
	public void insertValues(Connection cn,SpringBootModel model) throws SQLException
	{
		PreparedStatement stmt=cn.prepareStatement("insert into student values(?,?,?,?)");  
		stmt.setString(1,model.getId());
		stmt.setString(2,model.getStrName()); 
		stmt.setString(3,model.getStrResult()); 
		stmt.setInt(4,model.getIntMarks());
		int rs=stmt.executeUpdate(); 
	}
	public ArrayList<SpringBootModel> retrieveValues(Connection cn) throws SQLException
	{
		Statement stmt=cn.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from student"); 
		ArrayList<SpringBootModel> as=new ArrayList();
		while(rs.next())
		{
			SpringBootModel model=new SpringBootModel(rs.getString("id"),rs.getString("name"),rs.getString("result"),rs.getInt("marks"));
			as.add(model);
		}
		return as;
	}
	
}
