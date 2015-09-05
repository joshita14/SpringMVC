package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
 * Now need to form a dynamic user path, for forming adynamic user path i have to use {}
 * Now my url becomes : /welcome/testing/joshita(eg)
 * Now getting the dynamic user entered value in path
 */
@Controller

public class ControllerWithDynamicPath{
	@RequestMapping("/welcome/{enteredvalue}/{entertedvalue1}")
	public ModelAndView helloworld(@PathVariable("enteredvalue") String enteredValue, @PathVariable("entertedvalue1") String enteredValue1){
		
		ModelAndView model = new ModelAndView("HelloWorldPage");
		model.addObject("message1",enteredValue+enteredValue1);
		return model;
	}
}