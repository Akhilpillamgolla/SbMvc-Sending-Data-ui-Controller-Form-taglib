package com.SpringMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
	
	@GetMapping("/customer")
	public String loadForm(Model model) {   //used to load data
		
		Customer customerObj = new Customer();
		
		model.addAttribute("customer",customerObj);   //Sending Empty Object In View  for Form Binding
		
		return "index";    //adding empty Customer to Logical View 
	}

	@PostMapping("/customer")   //we can bind same path to multiple 
	public String handleSubmitBtn(Customer customer, Model model) {   //used to Save data
		
		model.addAttribute("customObj", customer);
		
		return "data";
	}
	
}
