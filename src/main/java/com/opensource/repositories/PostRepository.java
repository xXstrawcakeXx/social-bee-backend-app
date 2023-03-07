package com.opensource.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
	
}
