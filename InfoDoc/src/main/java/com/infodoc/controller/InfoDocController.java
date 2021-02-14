package com.infodoc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infodoc.model.Doctor;
import com.infodoc.model.Retailer;
import com.infodoc.services.DoctorService;
import com.infodoc.services.MappingService;
import com.infodoc.services.RetailerService;

@RestController
@RequestMapping("info-doc/v1")
public class InfoDocController {
	@Autowired
	private DoctorService doctorService;
	@Autowired
	private RetailerService retailerService;
	@Autowired
	private MappingService mappingService;
	
	@PostMapping("/retailer")
	public String createReatilers(@RequestBody Retailer retailer) {
		return retailerService.createReatiler(retailer);
	}
	@GetMapping("/retailer/_all")
	public List<Retailer> findAllReatilers() {
		return retailerService.findAllReatilers();
	}
	@GetMapping("/findRetailerById/{id}")
	public Retailer findRetailerById(@PathVariable("id") int id) {
		return retailerService.findRetailerById(id);
	}
	@GetMapping("/doctorsInStoreById/{id}")
	public List<Doctor> findAllDoctorsById(@PathVariable("id") int id) {
		return retailerService.findAllDoctorsByStoreId(id);
	}
	
	@PostMapping("/doctor")
	public String createDoctor(@RequestBody Doctor doctor) {
		return doctorService.createDoctor(doctor);
	}
	@GetMapping("/doctor/_all")
	public List<Doctor> findAlldoctors() {
		return doctorService.findAlldoctors();
	}
	@GetMapping("/findDoctorByLicenseNo/{licenseNo}")
	public Doctor findDoctorByLicenseNo(@PathVariable("licenseNo") String licenseNo) {
			return doctorService.findDoctorByLicenseNo(licenseNo);
	}
	@PostMapping("/mapRetailerDoctor/{retailerId}/{licenseNo}")
	public String mapReatilerDoctor(@PathVariable("retailerId") int retailerId,@PathVariable("licenseNo") String licenseNo) {
		return mappingService.mapReatilerDoctor(retailerId, licenseNo);
	}
}
