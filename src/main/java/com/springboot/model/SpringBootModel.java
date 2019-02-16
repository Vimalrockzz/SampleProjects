package com.springboot.model;

public class SpringBootModel {
	public String id;
    public String strName;
	public String strResult;
	public int intMarks;
	
	public SpringBootModel()
	{
		
	}
	
	public SpringBootModel(String id,String strName, String strResult, int intMarks) {
		super();
		this.id=id;
		this.strName = strName;
		this.strResult = strResult;
		this.intMarks = intMarks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrResult() {
		return strResult;
	}
	public void setStrResult(String strResult) {
		this.strResult = strResult;
	}
	public int getIntMarks() {
		return intMarks;
	}
	public void setIntMarks(int intMarks) {
		this.intMarks = intMarks;
	}

}
