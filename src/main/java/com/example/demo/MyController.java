package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;



@Controller
//@RequestMapping("student")
// aggiunge un prefisso student a tutti i metodi di questa
//classe
public class MyController {
	
	@GetMapping("provametodo")
	public String provaMetodo() {
		System.out.println("dentro provametodo");
		return "ciao";
		//views/ciao.jsp
	}
	
	//localhost:8080/home
	//localhost:8080/student/home
    @GetMapping("home")
    public String gohome() {
    	
    	System.out.println("hello");
        return "home";
 
    }
    
    
	@GetMapping("/prepreInserimento")
	public String preStudent(Model m) {
	   m.addAttribute("studentForm", new Student());
		
		return "inserimentoStudente";

	}
   

   
	@PostMapping("/inserimento")
	public String aggiorna( Student s) {

		
		System.out.println(s.getName());
		
		
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
