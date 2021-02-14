package com.infodoc.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infodoc.model.Doctor;
import com.infodoc.repositories.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepo;
	
	public String createDoctor(Doctor doctor) {
		String resultString = "";
		Optional<Doctor> doctor2 = doctorRepo.findById(doctor.getLicenseNo());
		if(doctor2.isPresent())
			resultString = "Doctor is already registered in the system.....";
		else {
			doctorRepo.save(doctor);
			resultString = "Warm welcome to InfoDoc doctor: "+doctor.getFirstName();
		}
		return resultString;
	}
	public List<Doctor> findAlldoctors() {
		return doctorRepo.findAll();
	}

	public Doctor findDoctorByLicenseNo(String licenseNo) {
		Doctor doctor = null;
		Optional<Doctor> doctor2 = doctorRepo.findById(licenseNo);
			if(doctor2!=null)
				doctor = doctor2.get();
			return doctor;
	}
}
