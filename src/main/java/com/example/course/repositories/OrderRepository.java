package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Order;
import com.example.course.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
