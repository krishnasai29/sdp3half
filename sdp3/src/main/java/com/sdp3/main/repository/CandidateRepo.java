package com.sdp3.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdp3.main.entity.Candidate;

public interface CandidateRepo extends JpaRepository<Candidate, Integer>{
	
}
