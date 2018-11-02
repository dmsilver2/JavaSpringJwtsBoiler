package com.JwtsBoiler.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.JwtsBoiler.demo.domain.User;
import com.JwtsBoiler.demo.domain.UserRepository;

@SpringBootApplication
public class JavaSpringJwtsApplication {

	@Autowired	
	private UserRepository urepository;	
	
	public static void main(String[] args) {
		SpringApplication.run(JavaSpringJwtsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
			//password for user1 and user2 is user
			urepository.save(new User("user1", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));
			urepository.save(new User("user2", "$2a$04$1.YhMIgNX/8TkCKGFUONWO1waedKhQ5KrnB30fl0Q01QKqmzLf.Zi", "USER"));
			//password for admin is admin
			urepository.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "ADMIN"));
		};
	}
}
