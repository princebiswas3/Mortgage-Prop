package com.citi.mortgage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Circle;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.citi.mortgage.model.PropertyDetails;
import com.citi.mortgage.model.PropertyDetailsEntity;
import com.citi.mortgage.util.ConversionUtility;

@Service
public class LocationFinderService {

	@Autowired
	private MongoOperations operation;

	public void creatRecord(PropertyDetails det)
	{
		PropertyDetailsEntity entity=ConversionUtility.convertToEntity(det);
		System.out.println("Entity value is in create "+entity);
		operation.save(entity);	
		System.out.println("Entity create operation  sucessfuly performed");
	}

	public List<PropertyDetailsEntity> findAllRecords()
	{
		System.out.println("Entity findAllRecords operation  sucessfuly performed");
		return operation.findAll(PropertyDetailsEntity.class);
	}
	public List<PropertyDetailsEntity> findRecordByDistance(float longitude,float latitude,int distance)
	{
		Point basepoint=new Point(longitude,latitude);
		Distance d=new Distance(distance,Metrics.MILES);
		Circle area=new Circle(basepoint,d);
		Query query=new Query();
		query.addCriteria(Criteria.where("where address.geoLocation").withinSphere(area));
		System.out.println("Entity findRecordByDistance operation performing"+query);
		return operation.find(query, PropertyDetailsEntity.class);
	}
	

}
