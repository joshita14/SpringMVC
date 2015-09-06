package com.springmvc.httpmethods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
	
	private  String studentname;
	private  String studenthobby;
	private Date date;
	private Integer studentMobileNo;
	private ArrayList<String> studentSkills;

	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getStudentMobileNo() {
		return studentMobileNo;
	}
	public void setStudentMobileNo(Integer studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	public String getStudentname() {
		return studentname;
	}
	public  void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentvalue() {
		return studenthobby;
	}
	public  void setStudentvalue(String studentvalue) {
		this.studenthobby = studentvalue;
		
		//NOt able to understand this , this willset the value of studenthobby in class varibale , now why the jsp page gives error when i write
		//s.studenthobby ? why s.studentvalue works
		System.out.println("\n"+studenthobby);
	}
	
	
}
