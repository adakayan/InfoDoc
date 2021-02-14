package com.infodoc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infodoc.model.Retailer;

@Repository
public interface RetailerRepository extends JpaRepository<Retailer,Integer> {

}
