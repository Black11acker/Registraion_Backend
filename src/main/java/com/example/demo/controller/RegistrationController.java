package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.RegistrationBean;
import com.example.demo.repository.RegistrationRepository;
@CrossOrigin(origins = "http://localhost:3000")

@RestController
@RequestMapping("/employee")
public class RegistrationController {
	   @Autowired
	   private RegistrationRepository registrationrepo;
	   
	   @GetMapping("/viewAll")
	   public List<RegistrationBean> viewall(){
			return registrationrepo.findAll();
	   }

	   @PostMapping("/add")
	   public RegistrationBean createRegistration(@RequestBody RegistrationBean registration){
			return registrationrepo.save(registration);
	   }
	

}
