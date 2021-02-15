package com.infodoc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infodoc.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
	public List<Request> findAllByRecieverId(String recieverId);
	public List<Request> findAllBySenderId(String senderId);
}
