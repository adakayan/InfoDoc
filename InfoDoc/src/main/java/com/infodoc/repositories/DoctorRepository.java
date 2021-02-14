package com.infodoc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infodoc.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {
}
