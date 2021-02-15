package com.infodoc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.infodoc.model.Doctor;
import com.infodoc.model.Retailer;
import com.infodoc.model.RetailerDoctor;
import com.infodoc.repositories.DoctorRepository;
import com.infodoc.repositories.RetailerDoctorRepository;
import com.infodoc.repositories.RetailerRepository;

@Service
public class RetailerService {

	@Autowired
	private RetailerRepository retailerRepo;
	@Autowired
	private DoctorRepository doctorRepo;
	@Autowired
	private RetailerDoctorRepository retailerDoctorRepository;
	@Value("${retailer.id.prefix:RT_}")
	private String retailerPrefix;
	public String createReatiler(Retailer retailer) {
		String resultString = "";
		int hashcode = retailer.hashCode();
		String idStr = retailerPrefix+String.valueOf(hashcode);
		Optional<Retailer> retailer2 = retailerRepo.findById(idStr);
		if(retailer2.isPresent())
			resultString = "Retailer/Store already present with store ID: "+idStr;
		else {
			retailer.setStoreId(idStr);
			retailerRepo.save(retailer);
			resultString = "Retailer saved successfully..... with store ID: "+idStr;
		}
		return resultString;
	}
	public List<Retailer> findAllReatilers() {
		return retailerRepo.findAll();
	}
	public Retailer findRetailerById(String id) {
		return retailerRepo.findById(id).get();
	}
	public List<Doctor> findAllDoctorsByRetailerDoctors(String id) {
		List<Doctor> doctorList = new ArrayList<>();
		List<RetailerDoctor> retailerDoctors = retailerDoctorRepository.findAllByRetailerId(id);
		if(retailerDoctors!=null && retailerDoctors.size()>0) {
			for(RetailerDoctor retailerDoctor: retailerDoctors) {
				doctorList.add(doctorRepo.findById(retailerDoctor.getLicenseNo()).get());
			}
		}
		return doctorList;
	}
}
