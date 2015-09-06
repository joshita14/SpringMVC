package com.springmvc.httpmethods;

public class Student {
	
	private  String studentname;
	private  String studenthobby;
	
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
