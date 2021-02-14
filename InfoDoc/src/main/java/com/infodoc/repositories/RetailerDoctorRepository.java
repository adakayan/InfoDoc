package com.infodoc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infodoc.model.RetailerDoctor;

@Repository
public interface RetailerDoctorRepository extends JpaRepository<RetailerDoctor,Integer> {
	public List<RetailerDoctor> findAllByStoreId(int storeId);
}
