package com.capgemini.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.demo.exception.RecordNotFoundException;
import com.capgemini.demo.model.Geo;
import com.capgemini.demo.repository.AssocGeoAssocRepository;
import com.capgemini.demo.repository.GeoRepository;
import com.capgemini.demo.repository.MainGeoAssocRepository;
@Service
public class GeoService {
	
	@Autowired
	AssocGeoAssocRepository agaRepository;
	@Autowired
	GeoRepository geoRepository;
	@Autowired
	MainGeoAssocRepository mgaRepository;
	
	public Geo addAllRecords(Geo geo) {
		return geoRepository.save(geo);
}
	public List<Geo> findAllRecords() {
		return geoRepository.findAll();
	}

	public Geo fetchById(int id) {
		return geoRepository.findById(id).orElseThrow(
				() -> new RecordNotFoundException("Record is not present with id " + id + " check with your Database"));
	}
	public String deleteId(int id) {
		String records = geoRepository.findById(id).map(geo -> {
			geoRepository.delete(geo);
			return "Delete Successfully!";
		}).orElseThrow(
				() -> new RecordNotFoundException("Record is not present with id " + id + " check with your Database"));
		return records;
	}

	public Geo updateId(int id, Geo updateDetails) {
		Geo update = fetchById(id);
		update.setGeoTypeId(updateDetails.getGeoTypeId());
		update.setGeoName(updateDetails.getGeoName());
		update.setGeoCode(updateDetails.getGeoCode());
		update.setGeoSecCode(updateDetails.getGeoSecCode());
		update.setAbbrevation(updateDetails.getAbbrevation());
		update.setAga(updateDetails.getAga());
		update.setMga(updateDetails.getMga());
		return addAllRecords(update);

	}
}






