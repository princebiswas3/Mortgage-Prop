package com.citi.mortgage.util;

import com.citi.mortgage.model.PropertyDetails;
import com.citi.mortgage.model.PropertyDetailsEntity;

public class ConversionUtility {
public static PropertyDetailsEntity convertToEntity(PropertyDetails det){
	PropertyDetailsEntity entity=new PropertyDetailsEntity();
	
	entity.setAddress(det.getAddress());
	System.out.println("Address is: "+entity.getAddress()+" cord: "+entity.getAddress().getGeoLocation()+" "+entity.getAddress().getGeoLocation().getLatitude());
	System.out.println(det.getAddress().getGeoLocation());
	entity.setFeatures(det.getFeatures());
	entity.setProertyPrice(det.getProertyPrice());
	entity.setReview(det.getReview());
	return entity;
	
}
	
}
