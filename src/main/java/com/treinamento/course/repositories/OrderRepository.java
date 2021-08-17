package com.treinamento.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.course.entites.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
}