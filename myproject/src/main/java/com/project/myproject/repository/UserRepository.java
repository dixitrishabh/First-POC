package com.project.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.myproject.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
