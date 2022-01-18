package com.reddit.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.files.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
