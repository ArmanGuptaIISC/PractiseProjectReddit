package com.reddit.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddit.files.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken,Long> {

}
