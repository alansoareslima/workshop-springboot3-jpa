package com.alansoareslima.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alansoareslima.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
