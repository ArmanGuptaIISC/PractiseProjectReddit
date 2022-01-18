package com.reddit.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.files.model.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
