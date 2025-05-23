package com.carloshsrosa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloshsrosa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
