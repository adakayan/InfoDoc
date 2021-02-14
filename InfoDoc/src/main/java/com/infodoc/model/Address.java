package com.infodoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	private long addressId;
	private String state;
	private String dist;
	private String pinCode;
	private String area;
	private String cityOrVill;
	private String streetName;
	private String shopNo;
	public Address() {
	}
	
	public Address(long addressId, String state, String dist, String pinCode, String area, String cityOrVill,
			String streetName, String shopNo) {
		super();
		this.addressId = addressId;
		this.state = state;
		this.dist = dist;
		this.pinCode = pinCode;
		this.area = area;
		this.cityOrVill = cityOrVill;
		this.streetName = streetName;
		this.shopNo = shopNo;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	@Column(name="state",nullable = false)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name="dist",nullable = false)
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	@Column(name="pin_code",nullable = false)
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Column(name="city_or_vill")
	public String getCityOrVill() {
		return cityOrVill;
	}
	public void setCityOrVill(String cityOrVill) {
		this.cityOrVill = cityOrVill;
	}
	@Column(name="area",nullable = false)
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Column(name="street_name")
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	@Column(name="shop_no")
	public String getShopNo() {
		return shopNo;
	}

	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", dist=" + dist + ", pinCode=" + pinCode
				+ ", area=" + area + ", cityOrVill=" + cityOrVill + ", streetName=" + streetName + ", shopNo=" + shopNo
				+ "]";
	}

	
}
