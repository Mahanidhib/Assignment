package com.capgemini.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.model.Geo;
import com.capgemini.demo.repository.AssocGeoAssocRepository;
import com.capgemini.demo.repository.GeoRepository;
import com.capgemini.demo.repository.MainGeoAssocRepository;
import com.capgemini.demo.service.GeoService;

@RestController
@RequestMapping(value ="/geo")
public class GeoController {

	
	 @Autowired
	 GeoRepository geoReposiory;
	 
	 @Autowired
	 AssocGeoAssocRepository agaRepository;
	 
	 @Autowired
	 MainGeoAssocRepository mgaRepository;
	 
	 @Autowired
	 GeoService geoService;
	 

		// adding all the records with child records
		@PostMapping("/addAllRecord")
		public Geo addAllRecords(@RequestBody Geo geo) {
			return geoService.addAllRecords(geo);
		}

		// get all records with child
		@GetMapping("/getAll")
		public List<Geo> findAllRecords() {
			return geoService.findAllRecords();
		}


		// fetch records of child and parent with parent id
		@GetMapping("/getRecords/{id}")
		public Geo getById(@RequestBody @PathVariable int id) {
			return geoService.fetchById(id);
		}

		// delete records of child and parent with parent id
		@DeleteMapping("/deleteby/{id}")
		public String deleteById(@RequestBody @PathVariable int id) {
			return geoService.deleteId(id);
		}

		// update record of child and parent with parent id
		@PutMapping("/update/{id}")
		public Geo updateById(@PathVariable int id, @RequestBody Geo updateDetails) {

			return geoService.updateId(id, updateDetails);
		}

	
}








/*package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.exception.RecordNotFoundException;
import com.example.test.model.UomConversionDated;
import com.example.test.repositry.DatedConversionToUomRepositry;
import com.example.test.repositry.DatedMainUomConversionDatedRepositry;
import com.example.test.repositry.UomConversionDatedRepositry;
import com.example.test.service.CommonEntiesService;

@RestController
@RequestMapping("/common")
public class CommonEntiesController {

	@Autowired
	UomConversionDatedRepositry uomRepositry;

	@Autowired
	DatedMainUomConversionDatedRepositry dateMainUomRepositry;

	@Autowired
	DatedConversionToUomRepositry dateToUomRepositry;
	@Autowired
	CommonEntiesService service;

	// adding all the recods with child records
	@PostMapping("/addAllRecord")
	public UomConversionDated addAllRecords(@RequestBody UomConversionDated dated) {
		return service.addAllRecords(dated);
	}

	// get all records with child
	@GetMapping("/getAll")
	public List<UomConversionDated> findAllRecords() {
		return service.findAllRecords();
	}

	// fetch records of child and parent with parent id
	@GetMapping("/getRecords/{id}")
	public UomConversionDated getById(@RequestBody @PathVariable int id) {
		return service.fetchById(id);
	}

	// delete records of child and parent with parent id
	@DeleteMapping("/deleteby/{id}")
	public String deleteById(@RequestBody @PathVariable int id) {
		return service.deleteId(id);
	}

	// update record of child and parent with parent id
	@PutMapping("/update/{id}")
	public UomConversionDated updateById(@PathVariable int id, @RequestBody UomConversionDated updateDetails) {

		return service.updateId(id, updateDetails);
	}

}*/
