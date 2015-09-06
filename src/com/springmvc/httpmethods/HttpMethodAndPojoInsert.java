package com.springmvc.httpmethods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HttpMethodAndPojoInsert {
	
	@RequestMapping (value="/studentform.html",method = RequestMethod.GET)
	private ModelAndView test(){
		
		ModelAndView model = new ModelAndView( "Form1" );   //This view is the name of the html/jsp page
		
		return model;
	}
	@RequestMapping(value ="/studentdetails.html")
	private ModelAndView test2(@RequestParam("studentname") String param1, @RequestParam("studenthobby") String param2){
		
		Student s = new Student();
		s.setStudentname(param1);
	    s.setStudentvalue(param2);
	    
	    
	    String meow = s.getStudentvalue();
	    System.out.println(param1 +"   "+param2  + meow );
	    
	    //passing the complete student student object, but the code should be optimised , because we have to create object each and everytime
		ModelAndView model = new ModelAndView( "Form2" );
		model.addObject("obj1","Passing the complete student object" );
		model.addObject("obj2",s );
		
		return model;
	}
}
