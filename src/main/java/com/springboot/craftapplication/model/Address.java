package com.springboot.craftapplication.model;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTADDRESS")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	String street;
	String city;
	String province_state;
	String country;
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
}
