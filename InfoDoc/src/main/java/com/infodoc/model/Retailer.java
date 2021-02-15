package com.infodoc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="retailers")
public class Retailer {
	private String retailerId;
	private String storeName;
	private Address address;
	private String openHours;
	private String closeHours;
	private String offDay1;
	private String offDay2;
	private long phNo;
	private String email;
	public Retailer() {
	}
	public Retailer(String retailerId, String storeName, Address address, String openHours, String closeHours,
			String offDay1, String offDay2, long phNo, String email) {
		super();
		this.retailerId = retailerId;
		this.storeName = storeName;
		this.address = address;
		this.openHours = openHours;
		this.closeHours = closeHours;
		this.offDay1 = offDay1;
		this.offDay2 = offDay2;
		this.phNo = phNo;
		this.email = email;
	}
	@Id
	@Column(name="retailer_id")
	public String getStoreId() {
		return retailerId;
	}
	public void setStoreId(String retailerId) {
		this.retailerId = retailerId;
	}
	@Column(name="store_name",nullable = false)
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL) 	
	@JoinColumn(name="address_id")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Column(name="open_hours")
	public String getOpenHours() {
		return openHours;
	}
	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}
	@Column(name="close_hours",nullable=false)
	public String getCloseHours() {
		return closeHours;
	}
	public void setCloseHours(String closeHours) {
		this.closeHours = closeHours;
	}
	@Column(name="off_day1")
	public String getOffDay1() {
		return offDay1;
	}
	public void setOffDay1(String offDay1) {
		this.offDay1 = offDay1;
	}
	@Column(name="off_day2")
	public String getOffDay2() {
		return offDay2;
	}
	public void setOffDay2(String offDay2) {
		this.offDay2 = offDay2;
	}
	@Column(name="ph_no",nullable = false)
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Column(name="email",nullable = false)
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", storeName=" + storeName + ", address=" + address + ", openHours="
				+ openHours + ", closeHours=" + closeHours + ", offDay1=" + offDay1 + ", offDay2=" + offDay2 + ", phNo="
				+ phNo + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + ((closeHours == null) ? 0 : closeHours.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((offDay1 == null) ? 0 : offDay1.hashCode());
		result = prime * result + ((offDay2 == null) ? 0 : offDay2.hashCode());
		result = prime * result + ((openHours == null) ? 0 : openHours.hashCode());
		result = prime * result + (int) (phNo ^ (phNo >>> 32));
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
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
		Retailer other = (Retailer) obj;
		if (closeHours == null) {
			if (other.closeHours != null)
				return false;
		} else if (!closeHours.equals(other.closeHours))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (offDay1 == null) {
			if (other.offDay1 != null)
				return false;
		} else if (!offDay1.equals(other.offDay1))
			return false;
		if (offDay2 == null) {
			if (other.offDay2 != null)
				return false;
		} else if (!offDay2.equals(other.offDay2))
			return false;
		if (openHours == null) {
			if (other.openHours != null)
				return false;
		} else if (!openHours.equals(other.openHours))
			return false;
		if (phNo != other.phNo)
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		return true;
	}
	
	
	
}
