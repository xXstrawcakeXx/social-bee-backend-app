package com.opensource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.models.Bio;

@Repository
public interface BioRepository extends JpaRepository<Bio, Integer>{
	
}
