package com.reddit.files.service;


import java.time.Instant;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reddit.files.dto.RegisterRequest;
import com.reddit.files.model.User;
import com.reddit.files.model.VerificationToken;
import com.reddit.files.repository.UserRepository;
import com.reddit.files.repository.VerificationTokenRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService {

	/*
	 * @Autowired
	 * private PasswordEncoder passwordEncode
	 * @Autowired
	 * private UserRepository userRepository
	 * 
	 ******Prefer Constructor injection over field injection*****
	 */
	private final PasswordEncoder passwordEncoder;
	private final UserRepository userRepository;
	private final VerificationTokenRepository verificationTokenRepository;
	@Transactional // As we interacting with Relational Database
	public void signUp(RegisterRequest registerRequest)
	{
		User user = new User();
		user.setUsername(registerRequest.getName());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
		user.setCreated(Instant.now());
		user.setEnabled(false);
		
		userRepository.save(user);
		
		String token = getVerficationToken(user);
	}

	private String getVerficationToken(User user) {
		String token = UUID.randomUUID().toString();
		VerificationToken verificationToken = new VerificationToken();
		verificationToken.setUser(user);
		verificationToken.setToken(token);
		
		verificationTokenRepository.save(verificationToken);
		return token;
	}
}
