package com.citi.mortgage.model;

public class Address {
private String state;
private String city;
private String county;
private Location geoLocation;
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public Location getGeoLocation() {
	return geoLocation;
}
public void setGeoLocation(Location geoLocation) {
	this.geoLocation = geoLocation;
}
@Override
public String toString() {
	return "Address [state=" + state + ", city=" + city + ", county=" + county + ", geoLocation=" + geoLocation + "]";
}

	
	
}
