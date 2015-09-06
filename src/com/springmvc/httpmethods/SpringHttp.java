package com.springmvc.httpmethods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * controller class showing how we can handle various http methods
 */

@Controller
public class SpringHttp {

	@RequestMapping(value = "/http/form.html" , method = RequestMethod.GET) 
	public ModelAndView helloworld(){
	
		ModelAndView model = new ModelAndView("Form1");
		return model;
	}

	@RequestMapping(value ="/form1.html" , method=RequestMethod.POST) 
	public ModelAndView testHttpMethodPost(@RequestParam("studentname") String name, @RequestParam("studenthobby") String value){
	
		ModelAndView model = new ModelAndView("Form2");
		model.addObject("message1","Details filled by you  :"+name+" and "+value);
		return model;
	}
}
