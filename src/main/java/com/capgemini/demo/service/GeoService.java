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












/*package com.example.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.test.exception.RecordNotFoundException;
import com.example.test.model.UomConversionDated;
import com.example.test.repositry.DatedConversionToUomRepositry;
import com.example.test.repositry.DatedMainUomConversionDatedRepositry;
import com.example.test.repositry.UomConversionDatedRepositry;

@Service
public class CommonEntiesService {

	@Autowired
	UomConversionDatedRepositry uomRepositry;
	@Autowired
	DatedMainUomConversionDatedRepositry dmcdRepositry;
	@Autowired
	DatedConversionToUomRepositry dctuRepositry;

	public UomConversionDated addAllRecords(UomConversionDated dated) {
		return uomRepositry.save(dated);
	}

	public List<UomConversionDated> findAllRecords() {
		return uomRepositry.findAll();
	}

	public UomConversionDated fetchById(int id) {
		return uomRepositry.findById(id).orElseThrow(
				() -> new RecordNotFoundException("Record is not present with id " + id + " check with your Database"));
	}

	public String deleteId(int id) {
		String records = uomRepositry.findById(id).map(uom -> {
			uomRepositry.delete(uom);
			return "Delete Successfully!";
		}).orElseThrow(
				() -> new RecordNotFoundException("Record is not present with id " + id + " check with your Database"));
		return records;
	}

	public UomConversionDated updateId(int id, UomConversionDated updateDetails) {
		UomConversionDated update = fetchById(id);
		update.setUomIdTo(updateDetails.getUomIdTo());
		update.setFromDate(updateDetails.getFromDate());
		update.setCustomeMethodId(updateDetails.getCustomeMethodId());
		update.setConversationFactories(updateDetails.getConversationFactories());
		update.setDecimalScale(updateDetails.getDecimalScale());
		update.setRoundingMode(updateDetails.getRoundingMode());
		update.setDmucd(updateDetails.getDmucd());
		update.setDctu(updateDetails.getDctu());
		return addAllRecords(update);

	}*/

}
