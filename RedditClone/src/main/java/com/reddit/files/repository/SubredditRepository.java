package com.reddit.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.files.model.Subreddit;

public interface SubredditRepository extends JpaRepository<Subreddit,Long>{

}
