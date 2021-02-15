package com.infodoc.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infodoc.model.Request;
import com.infodoc.model.Retailer;
import com.infodoc.model.RetailerDoctor;
import com.infodoc.repositories.RequestRepository;
import com.infodoc.repositories.RetailerDoctorRepository;
import com.infodoc.repositories.RetailerRepository;

@Service
public class RequestService {
	@Autowired
	private RequestRepository requestRepository;
	@Autowired
	private RetailerRepository retailerRepo;
	@Autowired
	private RetailerDoctorRepository retailerDoctorRepository;
	
	public String createRequest(Request request) {
		String resultString = "";
		Optional<Request> request2 = requestRepository.findById(request.hashCode());
		if(request2.isPresent()) {
			resultString = "Already requested before, please have paitense.....";
		}
		else {
			request.setRequestId(request.hashCode());
			request.setApproved(false);
			requestRepository.save(request);
			resultString="Wohoo, your request is placed successfully.....";
		}
		return resultString;
	}
	
	public List<Request> getSentRequestById(String id) {
		return requestRepository.findAllBySenderId(id);
	}
	
	public List<Request> getRecievedRequestById(String id) {
		return requestRepository.findAllByRecieverId(id);
	}
	
	public String approveRequestById(int id) {
		String resultString ="";
		Request request = requestRepository.findById(id).get();
		if(request.isApproved()) {
			resultString="Your request was already accepted.....!!!!!";	
		}
		else {
			Optional<Retailer> retailer = retailerRepo.findById(request.getSenderId());
			RetailerDoctor retailerDoctor = null;
			if(retailer.isPresent()) {
				retailerDoctor= new RetailerDoctor(request.getSenderId(),request.getRecieverId());
			}
			else {
				retailerDoctor= new RetailerDoctor(request.getRecieverId(),request.getSenderId());
			}
			retailerDoctor.setId(retailerDoctor.hashCode());
			retailerDoctorRepository.save(retailerDoctor);
			request.setApproved(true);
			requestRepository.save(request);
			resultString="Woho,request accepted.....!!!!!";	
		}
		return resultString;
	}
}
