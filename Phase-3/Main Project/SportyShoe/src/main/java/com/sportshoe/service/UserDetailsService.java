package com.sportshoe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportshoe.entity.UserDetails;
import com.sportshoe.repo.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
	UserDetailsRepository userRepo;
	
	public List<UserDetails> listAll()
	{
		return userRepo.findAll();
	}
	
	public List<UserDetails> get(String username) {
		return userRepo.findByusername(username);
	}
}

