package com.infodoc.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infodoc.model.RetailerDoctor;
import com.infodoc.repositories.RetailerDoctorRepository;

@Service
public class MappingService {
	@Autowired
	private RetailerDoctorRepository retailerDoctorRepository;
	
	public String mapReatilerDoctor(int retailerId,String licenseNo) {
		String resultString = "";
		RetailerDoctor retailerDoctor= new RetailerDoctor(retailerId,licenseNo);
		int hasCode = retailerDoctor.hashCode();
		Optional<RetailerDoctor> retailerDoctor1 = retailerDoctorRepository.findById(hasCode);
		if(retailerDoctor1.isPresent())
			resultString = "Doctor and retailer are already mapped .....";
		else {
			retailerDoctor.setId(hasCode);
			retailerDoctorRepository.save(retailerDoctor);
			resultString = "Doctor and retailer are mapped successfully .....";
		}
		return resultString;
	}
}
