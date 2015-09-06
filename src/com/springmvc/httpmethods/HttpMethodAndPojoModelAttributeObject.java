package com.springmvc.httpmethods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Notice here that the @RequestParam is replaced by @ModelAttribute("student1") Student s
 * @author joshita
 *
 */
@Controller
public class HttpMethodAndPojoModelAttributeObject {
	
	@RequestMapping (value="/studentform1.html",method = RequestMethod.GET)
	private ModelAndView test(){
		
		ModelAndView model = new ModelAndView( "Form1" );   //This view is the name of the html/jsp page
		
		return model;
	}
	@RequestMapping(value ="/studentdetails1.html")
	private ModelAndView test2(@ModelAttribute("student1") Student s){
		
	    //passing the complete student student object, but the code should be optimised , because we have to create object each and everytime
		ModelAndView model = new ModelAndView( "Form2" );
		model.addObject("obj1","Passing the complete student object" );
		
		return model;
	}
}
