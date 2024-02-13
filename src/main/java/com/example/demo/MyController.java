package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MyController {
	
    @GetMapping("/home")
    public String home(Model model) {
      //  model.addAttribute("message", "Hello from Spring Boot!");
        return "home";
        
        ///views/home.jsp
    }
    
    
	@RequestMapping("/prepreInserimento")
	public String preStudent(Model model) {
		String g = "ciao";
		model.addAttribute("ParolaCercata", g );
		
		return "inserimentoStudente";

	}
   
	@RequestMapping("/inserimento")
	public String aggiorna(Model model, Student s) {

		// s ha in automatico tutti i valori del form
		// senza usare model attribute
		
		// non ho chiamato jpa
		
		
		return "inserimentoStudenteOK";

	}
 
}
