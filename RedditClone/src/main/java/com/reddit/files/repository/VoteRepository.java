package com.reddit.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.files.model.Vote;

public interface VoteRepository extends JpaRepository<Vote,Long> {

}
