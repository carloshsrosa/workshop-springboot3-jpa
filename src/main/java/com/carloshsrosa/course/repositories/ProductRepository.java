package com.carloshsrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloshsrosa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
