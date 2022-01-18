package com.reddit.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.files.model.Post;

public interface PostRepository extends JpaRepository<Post,Long> {

}
