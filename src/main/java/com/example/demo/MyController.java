package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;



@Controller
public class MyController {
	
    @GetMapping("/home")
    public String home(Model model) {
    	
   
        return "home";
        
        ///views/home.jsp
    }
    
    
	@RequestMapping("/prepreInserimento")
	public String preStudent(Model model) {
	    model.addAttribute("studentForm", new Student());
		
		return "inserimentoStudente";

	}
   
	@RequestMapping("/prepreInserimentoHtmlPuro")
	public String prepreInserimentoHtmlPuro(Model model) {
		
		return "inserimentoStudenteHtmlPuro";

	}
   
	@RequestMapping("/inserimento")
	public String aggiorna(Model model,@ModelAttribute("studentForm")  Student s) {
        
		
		// s ha in automatico tutti i valori del form
		// senza usare model attribute
		
		// non ho chiamato jpa
		
		
		return "inserimentoStudenteOK";

	}
	@RequestMapping("/inserimentoHtmlPuro")
	public String inserimentoHtmlPuro(Model model, Student s) {

		// s ha in automatico tutti i valori del form
		// senza usare model attribute
		
		
		//model.addAttribute("msg_errore","esempio di errore");
		// nella jsp faccio un if e stampo il msg_errore
		
		
		return "inserimentoStudenteOK";

	}
	
	 @GetMapping("/esempioJstl")
	    public String esempioJstl(Model model) {
		 List<Student> res = new ArrayList<>();
		 
				 Student s =new Student();
		 s.setId(1);
		 s.setName("ciii");
		 res.add(s);
		 
	      model.addAttribute("myListStudents", res);
	        return "esempioJstl";
	        
	        ///views/home.jsp
	    }
 
}
