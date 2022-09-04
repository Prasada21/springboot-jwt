package com.prasad.springbootjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasad.springbootjwt.entity.User;



public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}