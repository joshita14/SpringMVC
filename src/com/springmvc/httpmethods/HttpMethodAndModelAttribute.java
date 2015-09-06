package com.springmvc.httpmethods;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HttpMethodAndModelAttribute {
	
	@RequestMapping (value="/studentform2.html",method = RequestMethod.GET)
	private ModelAndView test(){
		
		ModelAndView model = new ModelAndView( "Form1" );   //This view is the name of the html/jsp page
		return model;
	}
	
	/*
	 * When we have this method in the controller class, spring would first make a call to this method , rathr than making a call to its 
	 * request mapping methods
	 */
	@ModelAttribute
	private void modelObjetView(Model model){
		model.addAttribute("obj1","This is common and will be inserted in all pages" );
	}
	
	@RequestMapping(value ="/studentdetails2.html")
	private ModelAndView test2(@RequestParam("studentname") String param1, @RequestParam("studenthobby") String param2){
		
		Student s = new Student();
		s.setStudentname(param1);
	    s.setStudentvalue(param2);
	    
	    //passing the complete student student object, but the code should be optimised , because we have to create object each and everytime
		ModelAndView model = new ModelAndView( "Form2" );
		model.addObject("obj2",s );
		
		return model;
	}
}
