package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Notes :
 * @author joshita
 *
 *Look at the annotation :
 *@Controller annotation is such that we have annotation that the dispatcher servlet understands
 *learn dispatcher servlet as front controller
 *its responsible for request mapping and then provide the view received ..
 *component scan :base-package is responsible for for scanning the controller and then, in each controller it finds the @Requestmapping annotation
 *this annotation tells the dispatcher servlet to match the request mapping with the incoming URL, and then calls the method of the specific controller
 *once the method is executed the object is sent back to the view , and then the front controller would find the view defined in the xml file and would generate the view acc
 */
@Controller

public class HelloController{
	@RequestMapping("/welcome")
	public ModelAndView helloworld(){
		
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("message","hello world!Gosh this is my first and it worked after such long");
		
		return model;
		
	}
}