package com.infodoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="retailer_doctor")
public class RetailerDoctor {
	private int id;
	private String retailerId;
	private String licenseNo;
	
	public RetailerDoctor() {
		
	}

	public RetailerDoctor(String retailerId, String licenseNo) {
		super();
		this.retailerId = retailerId;
		this.licenseNo = licenseNo;
	}

	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="retailer_id")
	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	@Column(name="doc_license_no")
	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((licenseNo == null) ? 0 : licenseNo.hashCode());
		result = prime * result + ((retailerId == null) ? 0 : retailerId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetailerDoctor other = (RetailerDoctor) obj;
		if (licenseNo == null) {
			if (other.licenseNo != null)
				return false;
		} else if (!licenseNo.equals(other.licenseNo))
			return false;
		if (retailerId == null) {
			if (other.retailerId != null)
				return false;
		} else if (!retailerId.equals(other.retailerId))
			return false;
		return true;
	}

	
	
}
