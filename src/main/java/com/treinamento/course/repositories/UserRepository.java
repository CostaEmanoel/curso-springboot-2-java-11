package com.treinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.course.entites.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
}
