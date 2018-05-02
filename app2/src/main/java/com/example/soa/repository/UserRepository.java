package com.example.soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.soa.model.User;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
