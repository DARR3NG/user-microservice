package com.pfa.quickLinker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import com.pfa.quickLinker.model.Role;
import com.pfa.quickLinker.model.User;
import com.pfa.quickLinker.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class QuickLinker2Application {

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(QuickLinker2Application.class, args);
	}

	/* @PostConstruct
	void init_users() {
		//Ajouter les roles
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		
		// Ajouter les users
		userService.saveUser(new User(null,"admin","123",true,null));
		userService.saveUser(new User(null,"ELkastali","123",true,null));
		userService.saveUser(new User(null,"Otmane","123",true,null));
		
		//ajouter les roles aux users
		
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		
		
		userService.addRoleToUser("ELkastali", "ADMIN");
		userService.addRoleToUser("otmane", "USER");
		
		
		
	}
*/
	
	/*@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
*/	
}
