package com.springboot.craftapplication.dto;

public class AddressDTO {
	
	 String street;
	 String city;
	 String province_state;
	 String country;
	 Long Account_id;
	 
	public Long getAccount_id() {
		return Account_id;
	}
	public void setAccount_id(Long account_id) {
		Account_id = account_id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince_state() {
		return province_state;
	}
	public void setProvince_state(String province_state) {
		this.province_state = province_state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", province_state=" + province_state + ", country="
				+ country + "]";
	}
}
