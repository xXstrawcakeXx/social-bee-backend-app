package com.opensource.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.opensource.models.User;
import com.opensource.repositories.UserRepository;

@Service
public class UserService {

	UserRepository uRepo;
	
	public UserService(UserRepository uRepo) {
		this.uRepo = uRepo;
	}
	
	public List<User> findAll() {
		return uRepo.findAll();
	}
	
	public Optional<User> findById(int userId) {
		return uRepo.findById(userId);
	}
	
	public Optional<User> findByUsername(String username) {
		return uRepo.findByUsername(username);
	}
	
	public Optional<User> findByEmail(String userEmail) {
		return uRepo.findByEmail(userEmail);
	}
	

//	public boolean followUser(User follower, User following) {
//		
//		follower.setFollowing(follower.getFollowing().add(following));
//		if (follower.getFollowing().contains(following)) {
//			return true;
//		}
//		
//		
//		return false;
//	}
	
	
	
	
}
