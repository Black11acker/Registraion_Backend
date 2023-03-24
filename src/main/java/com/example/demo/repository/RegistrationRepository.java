package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.RegistrationBean;

import jakarta.servlet.Registration;

public interface RegistrationRepository extends JpaRepository<RegistrationBean, Integer>{
	
}

