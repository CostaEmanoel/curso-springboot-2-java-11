package com.treinamento.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.treinamento.course.entites.User;
import com.treinamento.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Marcelo silva", "marcelosilva@novo.com", "16983216549", "123456");
		User u2 = new User(null, "Joao silva", "joaosilva@novo.com", "16987654321", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
