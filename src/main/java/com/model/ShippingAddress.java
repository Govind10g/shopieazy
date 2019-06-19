package com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "shippingAddress")
public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = 7551999649936522523L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHIPPINGADDR_SEQ_GENERATOR")
	@SequenceGenerator(name = "SHIPPINGADDR_SEQ_GENERATOR", sequenceName = "SHIPPINGADDR_SEQ_GENERATOR", allocationSize = 1, initialValue = 1)
	@Column(name = "id", updatable = false, nullable = false)
	private Long shippingAddressId;

	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	@OneToOne(mappedBy = "shippingAddress")
	private Customer customer;

	public Long getBillingAddressId() {
		return shippingAddressId;
	}

	public void setBillingAddressId(Long billingAddressId) {
		this.shippingAddressId = billingAddressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
