package com.carloshsrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloshsrosa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
