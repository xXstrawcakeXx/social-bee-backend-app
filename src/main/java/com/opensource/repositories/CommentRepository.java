package com.opensource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.models.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer>{
	
}
