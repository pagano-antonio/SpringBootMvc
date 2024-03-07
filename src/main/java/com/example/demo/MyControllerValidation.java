package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;



@Controller
@RequestMapping("ctrvalidation")
public class MyControllerValidation {
	
 
    
    
	@RequestMapping("/preInsert")
	public String preStudent(Model model) {
		System.out.println("ddd");
	    model.addAttribute("studentForm", new Student());
		
		return "inserimentoStudenteValidator";

	}
   

   
	 @PostMapping("/inserimento")
	public String aggiorna(Model model,@Valid @RequestBody @ModelAttribute("studentForm")  Student s, BindingResult r) {
        if (r.hasErrors()) {
            return "inserimentoStudenteValidator";
        }

		
		// non ho chiamato jpa
		
		
		return "inserimentoStudenteOK";

	}
	
 
}
