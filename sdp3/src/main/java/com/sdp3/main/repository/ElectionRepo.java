package com.sdp3.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdp3.main.entity.Election;


public interface ElectionRepo extends JpaRepository<Election, Integer> {

}
