package com.springmvc.httpmethods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Notice here that the @RequestParam is replaced by @ModelAttribute("student1") Student s
 * We don't need to even add the object to the model object
 * Automatic data binding , the object will automatically bind the values, i have used list also
 * @author joshita
 *
 */
@Controller
public class HttpMethodAndPojoModelAutomaticDataBinding {
	
	@RequestMapping (value="/studentform3.html",method = RequestMethod.GET)
	private ModelAndView test(){
		
		ModelAndView model = new ModelAndView( "Form1" );   //This view is the name of the html/jsp page
		
		return model;
	}
	
	@RequestMapping(value ="/studentdetails3.html", method = RequestMethod.POST)
	private ModelAndView test2(@ModelAttribute( "obj1") Student s){
		
		//Rule : for this to work keep the name of the input variables same as the POJO class, this is because (as i guess)
		//here we dont explicitly cast the form element names into a key and then set that key value to the POJO object : see 
		//class "HttpMethodAndPojoInsert"
		
		System.out.println(s.getStudentMobileNo());
		System.out.println(s.getDate());
		System.out.println(s.getStudentvalue());
		
	   	ModelAndView model = new ModelAndView( "Form2" );
		
		return model;
	}
}
