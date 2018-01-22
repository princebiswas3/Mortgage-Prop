package com.citi.mortgage.model;

public class PropertyDetails {

	private float proertyPrice;
	private Address address;
	private Review review;
	public float getProertyPrice() {
		return proertyPrice;
	}
	public void setProertyPrice(float proertyPrice) {
		this.proertyPrice = proertyPrice;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public Features getFeatures() {
		return features;
	}
	public void setFeatures(Features features) {
		this.features = features;
	}
	private Features features;
	
	
}
