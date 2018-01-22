package com.citi.mortgage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.citi.mortgage.model.PropertyDetails;
import com.citi.mortgage.model.PropertyDetailsEntity;
import com.citi.mortgage.service.LocationFinderService;

@RestController
@RequestMapping(value="/proprtyFinder")
public class PropertyFinderController {

	@Autowired
	LocationFinderService service;
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public void createProperty(@RequestBody PropertyDetails prop)
	{
		service.creatRecord(prop);
	
	} 
	@RequestMapping(value="/getAll",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PropertyDetailsEntity> getAllProperty()
	{
		
		return service.findAllRecords();
	}
	
	@RequestMapping(value="/getbyLocation",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PropertyDetailsEntity> getSpecificProperty(@RequestParam(value="longitude") Float longitude, @RequestParam(value="latitude") Float latitude, @RequestParam(value="distance") int distance)
	{
		
		System.out.println("VALUE IS: "+longitude+" "+latitude);
		return service.findRecordByDistance(longitude, latitude,distance);
	}
	
	
}
